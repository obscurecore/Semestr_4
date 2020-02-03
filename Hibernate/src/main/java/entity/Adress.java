package entity;

import javax.persistence.Embeddable;
import javax.persistence.Transient;

//возможность другому классу взять поля обьекта в свою таблицу
@Embeddable
public class Adress {
    @Transient// не сохраняет данные в таблицу
    String street;
    int number;


}

