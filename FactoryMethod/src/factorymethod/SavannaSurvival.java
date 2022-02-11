/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author araju55
 */
public class SavannaSurvival extends SurvivalGame {
    
    @Override
    public Patch createPatch() {
        return new GrassLand();
    }
    
    @Override
    public Barrier createBarrier() {
        return new River();
    }
}