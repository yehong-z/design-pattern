package Builder;
// 建造者接口
interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getResult();
}