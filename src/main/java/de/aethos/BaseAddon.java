package de.aethos;

import de.aethos.skills.AethosSkillAPI;
import de.aethos.skills.addon.Addon;

public class BaseAddon extends Addon {
    public void onEnabled(AethosSkillAPI plugin){
        System.out.println("BaseAddon enabled");
    }

    public void onDisabled(AethosSkillAPI plugin){
        System.out.println("BaseAddon disabled");
    }

}
