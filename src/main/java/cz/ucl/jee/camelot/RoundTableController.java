package cz.ucl.jee.camelot;

import cz.ucl.jee.camelot.nobility.Knight;
import cz.ucl.jee.foreignlands.GorgeOfEternalPeril;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoundTableController {

    @Autowired
    private GorgeOfEternalPeril gorge;

    @Autowired
    private ApplicationContext context;

    @Autowired(required = false)
    private List<Knight> knights;

    @RequestMapping(value = "/goOnQuest", method = RequestMethod.GET)
    public String goOnQuest() {
        // you can get the beans also using this:
        //context.getBeansOfType(Knight.class);

        if (knights != null) {
            for (Knight knight : knights) {
                knight.startQuest("Crossing Gorge of Eternal Peril");
            }
			gorge.goAcross(knights);
        }
        return "The knights went to the Gorge of Eternal Peril.";
    }
}
