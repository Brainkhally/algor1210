package List;

public class Element {
    //Список реалізувати у вигляді двох класів: список та елемент списку
    int data;//Інформаційна частина списку – ціле число
    Element next;
    Element before;

    public Element(){
        //Класи мають містити конструктори
    }

    public Element(int value){
        ////Класи мають містити конструктори
        data = value;
    }
}
//а если просто создать новый проект,и перекинуть туда код ?