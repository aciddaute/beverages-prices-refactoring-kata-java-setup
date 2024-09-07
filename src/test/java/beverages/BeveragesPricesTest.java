package beverages;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class BeveragesPricesTest {

    private final Offset<Double> doubleOffset = Assertions.offset(0.001);

    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price()).isCloseTo(1.20, doubleOffset);
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price()).isCloseTo(1.50, doubleOffset);
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price()).isCloseTo(1.45, doubleOffset);
    }

    @Test
    public void computes_tea_with_milk_price() {
        Tea teaWithMilk = new TeaWithMilk();
        assertThat(teaWithMilk.price()).isCloseTo(1.60, doubleOffset);
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Coffee coffeeWithMilk = new CoffeeWithMilk();
        assertThat(coffeeWithMilk.price()).isCloseTo(1.30, doubleOffset);
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Coffee coffeeWithMilkAndCream = new CoffeeWithMilkAndCream();
        assertThat(coffeeWithMilkAndCream.price()).isCloseTo(1.45, doubleOffset);
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        HotChocolateWithCream hotChocolateWithCream = new HotChocolateWithCream();
        assertThat(hotChocolateWithCream.price()).isCloseTo(1.60, doubleOffset);
    }
}