import com.juaracoding.aldoujian2jf.ujian2.ATM;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {

    private ATM atm; //dekalrasi variabel atm

    //setting saldo awal untuk setiap method pengujian
    @BeforeMethod
    public void setUp(){
        atm = new ATM(1000);
    }

    //method untuk lihat saldo
    @Test
    public void testLihatSaldo(){
        double expected = 1000;
        double actual = atm.lihatSaldo();
        Assert.assertEquals(actual,expected);
    }

    //method pengujian untuk setor uang
    @Test
    public void testSetorUang(){
        atm.setorUang(1000);
        double expected = 2000;
        double actual = atm.lihatSaldo();
        Assert.assertEquals(actual,expected);
    }

    //method pengujian untuk setor uang negatif menggunakan exception
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif(){
        atm.setorUang(-900);
    }

    //method pengujian untuk tarik tunai
    @Test
    public void testTarikUang(){
        atm.tarikUang(700);
        double expected = 300;
        double actual = atm.lihatSaldo();
        Assert.assertEquals(actual,expected);
    }

    //method pengujian untuk tarik tunai lebih dari saldo
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo(){
        atm.tarikUang(2000);
    }

    //method pengujian untuk tarik tunai negatif
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif(){
        atm.tarikUang(-1000);
    }

}
