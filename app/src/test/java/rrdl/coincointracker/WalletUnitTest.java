package rrdl.coincointracker;

import org.junit.Test;

import rrdl.coincointracker.Model.Wallet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.Mockito.*;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletUnitTest {
    @Test
    public void CreateWallet() throws Exception {
        Wallet wallet = new Wallet(42);

        assertEquals(42, wallet.getBalance(),0.001);
    }

    @Test
    public void DepositMoney() throws Exception {
    Wallet wallet=new Wallet(0);
    wallet.deposit(10);
        assertEquals(10, wallet.getBalance(),0.001);
    }

    @Test
    public void WithdrawMoney() throws Exception {
        Wallet wallet=new Wallet(20);
        wallet.withdraw(10);
        assertEquals(10, wallet.getBalance(),0.001);
    }

    @Test
    public void getUserToken() throws Exception {
        AuthActivity authActivity= mock(AuthActivity.class);
        when(authActivity.getUserToken()).thenReturn("FakeToken");
        String token=authActivity.getUserToken();
    }
}