package class07;

import java.util.HashMap;

public interface Discountable {

    void applyPercentDiscount(double percent);

    void applyFlatDiscount(double amount);

    void removeDiscount();

}
