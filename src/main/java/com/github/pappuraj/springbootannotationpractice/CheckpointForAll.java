package com.github.pappuraj.springbootannotationpractice;

import com.github.pappuraj.springbootannotationpractice.autowired.Autowired_DesktopComponent;
import com.github.pappuraj.springbootannotationpractice.component.Component_Engineer;
import org.springframework.context.ApplicationContext;

public class CheckpointForAll {
    static ApplicationContext context;
    public CheckpointForAll(ApplicationContext context){
        this.context=context;
    }


    public  void component(){
        //Component_Engineer engineer=context.getBean(Component_Engineer.class);

         /*
            In another way, you can use class name to init object, in this method you have to change the first character
            upper case to lower case. For example "Component_Engineer"(Class name) to "component_Engineer"(bean name)
         */

        Component_Engineer engineer= (Component_Engineer) context.getBean("component_Engineer");
        engineer.display();
    }


    public  void autowired(){
        Autowired_DesktopComponent desktop=context.getBean(Autowired_DesktopComponent.class);
        desktop.getSsd().getSSD();

    }

}
