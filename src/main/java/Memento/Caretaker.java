package Memento;


// 2. 负责人
class Caretaker {
    private Originator.Memento memento;

    public void saveState(Originator originator) {
        memento = originator.createMemento();
    }

    public void restoreState(Originator originator) {
        originator.restoreMemento(memento);
    }


    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置状态并保存
        originator.setState("State1");
        System.out.println("Initial State: " + originator.getState());
        caretaker.saveState(originator);

        // 更改状态
        originator.setState("State2");
        System.out.println("Updated State: " + originator.getState());

        // 恢复之前的状态
        caretaker.restoreState(originator);
        System.out.println("Restored State: " + originator.getState());
    }
}