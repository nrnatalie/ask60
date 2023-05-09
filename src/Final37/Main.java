package Final37;
//Задача 1
//Создайте класс "Человек", конструктор которого принимает имя.

//При попытке вывести объект этого класса на экран должна выводиться строка "Человек по имени ...".

//Добавьте в класс "Человек" метод "приветствие", который будет выводить строку: "Я родился!"

//Создайте классы "Мужчина" и "Женщина", которые будут наследниками класса "Человек".

// Попытка вывести их на экран должна приводить к выводу строки "Мужчина по имени ..."
// или "Женщина по имени ..."

//Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"{

import Homework.Human;
import Homework.Man;
import Homework.Woman;

public class Main {

  public static void main(String[] args) {
    Homework.Human human = new Human("Егор");
    human.welcomeHuman();
    Homework.Man man = new Man("Вася");
    man.welcomeHuman();
    Homework.Woman woman = new Woman("Елена");
    woman.welcomeHuman();

  }
}
//Я родился! Человек по имени...Егор
//Мужчина по имени...Вася
//Я родилась! Женщина по имени...Елена

