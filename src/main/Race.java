/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 29-10-2020
 *   Time: 20:04
 *   File: Race.java
 */
package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.start();
    }
}
