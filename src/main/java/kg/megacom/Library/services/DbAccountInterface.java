package kg.megacom.Library.services;

import kg.megacom.Library.models.user.Account;
import kg.megacom.Library.models.user.AddressUser;
import kg.megacom.Library.models.user.User;

public interface DbAccountInterface {

        boolean saveAccount(User user , Account account, AddressUser addressUser);
        boolean checkAccount( Account account);
}
