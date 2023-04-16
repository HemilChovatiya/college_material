/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdderImplRemote;
import javax.ejb.Stateless;
@Stateless(mappedName = "st1")
public class AdderImpl implements AdderImplRemote {
 public int add(int a, int b) {
 return a + b;
 }
}
