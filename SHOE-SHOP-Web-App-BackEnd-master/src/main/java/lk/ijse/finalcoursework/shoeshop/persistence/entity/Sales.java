package lk.ijse.finalcoursework.shoeshop.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "added_points")
    private Double addedPoints;

    @Column(name = "cashier_name")
    private String cashierName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy =  "sales")
    private List<SalesDetails> salesDetails = new ArrayList<>();
}
