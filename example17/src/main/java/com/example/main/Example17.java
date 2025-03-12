package com.example.main;

import com.example.Services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.Person;
import com.example.config.ProjectConfig;

public class Example17 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleServices vehicleServices1=context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2=context.getBean("vehicleServices",VehicleServices.class);

        System.out.println(vehicleServices1.hashCode());
        System.out.println(vehicleServices2.hashCode());

        if(vehicleServices1==vehicleServices2)
            System.out.println("Singleton");
        else
            System.out.println("Prototype");

        context.close();
    }
}

/**
 * The vehicleServices bean is created 3 time even when i call it 2 times explicitly
 * bcz 1 time it is created by vehicle bean. inside which I am autowiring it. Vehicle bean is singleton, so no matter how many times I inject it inside it, it will have only 1 instance of VehicleService bean
 * */

/**
 * We use Prototype scope when there is alot of modification required by beans inside their objects , to avoid race conditions in multithreading environment.
 */




/**Singleton Scope
1. This is the default scope inside Spring framework
2. The same object instance will be returned every time we refer a bean inside the code
3. We can configure to create the beans during the start up or when the first time referred
4. Immutable objects can be ideal for Singleton scope
5. Most commonly used scope
 */


/**
 *  Prototype Scope
 * 1. Need to explicitly configure using @Scope(BeanDefinition.SCOPE_PROTOTYPE)
 * 2. New object instance will be returned every time we refer a bean inside the code
 * 3. Spring always creates the new object when we try to refer the bean. No eager instantiation is possible
 * 4. Mutable objects can be ideal for prototype scope
 * 5. Very rarely used scope
 */