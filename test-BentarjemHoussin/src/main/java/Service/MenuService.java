package Service;

import Repository.MenuRepository;
import entities.Composant;
import entities.Menu;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static java.awt.SystemColor.menu;

public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public Menu ajoutComposantsEtMiseAJourPrixTotalMenu(Set<Composant> composants, Long idMenu) {
         menu = menuRepository.findById(idMenu).orElseThrow(() -> new RuntimeException("No Menu"));
        menu.getComposants().addAll(composants);
        // Mettez à jour le prix total en fonction des composants
        // ...

        return menuRepository.save(menu);
    }
}
}
