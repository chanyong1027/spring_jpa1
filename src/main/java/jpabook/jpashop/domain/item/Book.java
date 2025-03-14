package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jpabook.jpashop.service.UpdateBookDto;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("B")
@Getter @Setter
public class Book extends Item {

    private String author;
    private String isbn;

    public void changeBook(String name, int price, int stockQuantity, String author, String isbn) {
        super.changeItem(name, price, stockQuantity);
        this.author = author;
        this.isbn = isbn;
    }
}
