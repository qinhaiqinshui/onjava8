package main;

import java.util.stream.Stream;

import org.junit.Test;


public enum DemoEnum {
    //括号中的“红色”赋值给value
    RED("红色"){
        @Override
        public void draw() {
            //这里DemoEnum相当于RED父类了，使用super才能访问到15行定义的value变量
            System.out.println("绘制红色 " +super.value);
        }
    },
    WHITE("黑色"),
    BLACK("白色");
    
    private   String value;

    // 自定义构造,虽然没有写private,但是默认就是private
    DemoEnum(String v) {
        value = v;
    }

    // 自定义方法
    @Test
    public void draw() {
        
        System.out.println("绘制 " + value);
    }
    public static void main(String[] args) {
        System.out.println(DemoEnum.class.getPackageName());
        Stream.of(DemoEnum.values()).forEach(
            e->{
                System.out.println("name: "+e.name());
                e.draw();
                System.out.println("value: "+e.value);
            }
        );
        
    }
}
