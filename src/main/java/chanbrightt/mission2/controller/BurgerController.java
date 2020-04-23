package chanbrightt.mission2.controller;
import java.util.List;

import chanbrightt.mission2.model.BurgerMenu;
import chanbrightt.mission2.repository.BurgerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class BurgerController {

    @Autowired
    BurgerRepository burgerRepository;

    @GetMapping("/allMenus")
    public List<BurgerMenu> getAllBurgers(){
        return burgerRepository.findAll();
    }

    @GetMapping("/{menuId}")
    public BurgerMenu getMenuById(@PathVariable(name="menuId") Integer menuId){
        return burgerRepository.getOne(menuId);
    }

    @PostMapping("/save")
    public List<BurgerMenu> saveAllBurgers(@RequestBody BurgerMenu burgerMenu){
        burgerRepository.save(burgerMenu);
        return burgerRepository.findAll();
    }

    @DeleteMapping("/delete/{menuId}")
    public List<BurgerMenu> deleteById(@PathVariable(name="menuId") Integer menuId){
        burgerRepository.deleteById(menuId);
        return burgerRepository.findAll();
    }

    @PutMapping("/update")
    public BurgerMenu updateMenu(@RequestBody BurgerMenu burgerMenu){
        return burgerRepository.save(burgerMenu);
    }
}
