package com.higgsup.Observer_Pattern.example2;

public class Main {
    public static void main(String[] args) {
        // tạo một topic
        MyTopic topic = new MyTopic();

        // tạo các người dùng là người sẽ quan sát
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        //đăng ký để theo dõi topic
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //check if any update is available
        obj1.update();

        //now send message to subject
        topic.postMessage("hôm nay là thứ 4");
        System.out.println("đ");
        topic.unregister(obj3);
        topic.postMessage("Ngày mai là thứ 5");

    }
}
