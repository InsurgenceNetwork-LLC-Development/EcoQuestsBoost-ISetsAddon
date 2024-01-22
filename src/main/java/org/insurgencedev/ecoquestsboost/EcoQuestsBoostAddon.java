package org.insurgencedev.ecoquestsboost;

import org.insurgencedev.ecoquestsboost.listeners.QuestsExperienceGainListener;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;
import org.insurgencedev.insurgencesets.libs.fo.Common;

@ISetsAddon(name = "EcoQuestsBoost", version = "1.0.1", author = "Insurgence Dev Team", description = "Boost the quest experience earned from EcoQuests")
public class EcoQuestsBoostAddon extends InsurgenceSetsAddon {

    @Override
    public void onAddonStart() {
        if (Common.doesPluginExist("EcoQuests")) {
            registerEvent(new QuestsExperienceGainListener());
        }
    }
}
