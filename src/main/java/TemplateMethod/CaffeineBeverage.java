package TemplateMethod;

abstract class CaffeineBeverage {
    // 模板方法
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 基本方法，由子类实现
    protected abstract void brew();
    protected abstract void addCondiments();

    // 已实现的基本方法
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}