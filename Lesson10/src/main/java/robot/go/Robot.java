package robot.go;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import robot.hands.IHand;
import robot.heads.IHead;
import robot.legs.ILeg;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }
}
