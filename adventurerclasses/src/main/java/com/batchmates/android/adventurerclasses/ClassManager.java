package com.batchmates.android.adventurerclasses;

import android.util.Log;

/**
 * Created by Android on 8/31/2017.
 */

public class ClassManager {

    private static final String TAG = "ClassManager";

    //classes
    private Barbarian barb;
    private BloodMage bloodMage;
    private Cleric cleric;
    private Druid druid;
    private ElementalMage elementalMage;
    private Inquizator inquizator;
    private Paladin paladin;
    private Priest priest;
    private Rogue rogue;
    private Shaman shaman;
    private Thief thief;
    private Warrior warrior;

    //class levels
    private int level=0;
    private int barbLvl=0;
    private int bloodMageLvl=0;
    private int clericLvl=0;
    private int druidLvl=0;
    private int elementalMageLvl=0;
    private int inquizitorLvl=0;
    private int paladinLvl=0;
    private int priestLvl=0;
    private int rogueLvl=0;
    private int shamanLvl=0;
    private int thiefLvl=0;
    private int warriorLvl=0;

    public Skills skills=new Skills();

    public void increaseLevel(Object classToLevelUp)
    {
        if(classToLevelUp instanceof Barbarian)
        {
            barb=(Barbarian)classToLevelUp;
            barbLvl=barb.increaseLevel(barbLvl);
            level++;
            increaseBarbarianSkills();
            Log.d(TAG, "increaseLevel: Barbarian "+barbLvl);
        }

        if(classToLevelUp instanceof BloodMage)
        {
            bloodMage=(BloodMage) classToLevelUp;
            bloodMageLvl=bloodMage.increaseLevel(bloodMageLvl);
            level++;
            increaseBloodMageSkills();
            Log.d(TAG, "increaseLevel: BloodMage "+bloodMageLvl);
        }


        if(classToLevelUp instanceof Cleric)
        {
            cleric=(Cleric) classToLevelUp;
            clericLvl=cleric.increaseLevel(clericLvl);
            level++;
            increaseClericSkills();
            Log.d(TAG, "increaseLevel: Cleric "+clericLvl);
        }

        if(classToLevelUp instanceof Druid)
        {
            druid=(Druid) classToLevelUp;
            druidLvl=druid.increaseLevel(druidLvl);
            level++;
            increaseDruidSkills();
            Log.d(TAG, "increaseLevel: Druid "+druidLvl);
        }

        if(classToLevelUp instanceof ElementalMage)
        {
            elementalMage= (ElementalMage) classToLevelUp;
            elementalMageLvl=elementalMage.increaseLevel(elementalMageLvl);
            level++;
            increaseElementalMageSkills();
            Log.d(TAG, "increaseLevel: ElementalMage "+elementalMageLvl);
        }

        if(classToLevelUp instanceof Inquizator)
        {
            inquizator= (Inquizator) classToLevelUp;
            inquizitorLvl=inquizator.increaseLevel(inquizitorLvl);
            level++;
            increaseInquizitorSkills();
            Log.d(TAG, "increaseLevel: Inquizitor "+inquizitorLvl);
        }

        if(classToLevelUp instanceof Paladin)
        {
            paladin= (Paladin) classToLevelUp;
            paladinLvl=paladin.increaseLevel(paladinLvl);
            level++;
            increasePaladinSkills();
            Log.d(TAG, "increaseLevel: Paladin "+paladinLvl);
        }

        if(classToLevelUp instanceof Priest)
        {
            priest= (Priest) classToLevelUp;
            priestLvl=priest.increaseLevel(priestLvl);
            level++;
            increasePriestSkills();
            Log.d(TAG, "increaseLevel: Priest "+priestLvl);
        }

        if(classToLevelUp instanceof Rogue)
        {
            rogue= (Rogue) classToLevelUp;
            rogueLvl=rogue.increaseLevel(rogueLvl);
            level++;
            increaseRogueSkills();
            Log.d(TAG, "increaseLevel: Rogue "+rogueLvl);
        }

        if(classToLevelUp instanceof Shaman)
        {
            shaman= (Shaman) classToLevelUp;
            shamanLvl=shaman.increaseLevel(shamanLvl);
            level++;
            increaseShamanSkills();
            Log.d(TAG, "increaseLevel: Shaman "+shamanLvl);
        }

        if(classToLevelUp instanceof Thief)
        {
            thief= (Thief) classToLevelUp;
            thiefLvl=thief.increaseLevel(thiefLvl);
            level++;
            increaseThiefSkills();
            Log.d(TAG, "increaseLevel: Thief "+thiefLvl);
        }


        if(classToLevelUp instanceof Warrior)
        {
            warrior= (Warrior) classToLevelUp;
            warriorLvl=warrior.increaseLevel(warriorLvl);
            level++;
            increaseWarriorSkills();
            Log.d(TAG, "increaseLevel: Warrior "+warriorLvl);
        }
    }

    private void increaseWarriorSkills() {
        skills.increasePlatedMastery();
        skills.increasePolarmMastery();
        skills.increaseSwordMastery();
        skills.increaseAxeMastery();
        skills.increaseMaceMastery();
    }

    private void increaseThiefSkills() {
        skills.increaseKnifeMastery();
        skills.increaseStealthMastery();
        skills.increaseSleightOfHandMastery();
        skills.increaseClothMastery();
        skills.increaseIceMastery();
    }

    private void increaseShamanSkills() {
        skills.increaseNatureMastery();
        skills.increaseAnimalMastery();
        skills.increaseAxeMastery();
        skills.increaseDivinationMastery();
        skills.increaseLeatherMastery();
    }

    private void increaseRogueSkills() {
        skills.increaseKnifeMastery();
        skills.increaseStealthMastery();
        skills.increaseSwordMastery();
        skills.increaseLeatherMastery();
        skills.increaseSleightOfHandMastery();
    }

    private void increasePriestSkills() {
        skills.increaseHealingMastery();
        skills.increaseHolyMastery();
        skills.increaseMaceMastery();
        skills.increaseClothMastery();
        skills.increaseDamnationMastery();
    }

    private void increasePaladinSkills() {
        skills.increaseHolyMastery();
        skills.increaseShieldMastery();
        skills.increaseSwordMastery();
        skills.increaseMaceMastery();
        skills.increasePlatedMastery();
    }

    private void increaseInquizitorSkills() {
        skills.increaseDamnationMastery();
        skills.increaseHolyMastery();
        skills.increaseKnifeMastery();
        skills.increaseFireMastery();
        skills.increaseClothMastery();
    }

    private void increaseElementalMageSkills()
    {
        skills.increaseFireMastery();
        skills.increaseIceMastery();
        skills.increaseLightningMastery();
        skills.increaseClothMastery();
        skills.increaseSwordMastery();
    }


    private void increaseBarbarianSkills()
    {
        skills.increaseAxeMastery();
        skills.increaseMaceMastery();
        skills.increaseSwordMastery();
        skills.increasePolarmMastery();
        skills.increaseBloodMastery();
    }

    private void increaseBloodMageSkills()
    {
        skills.increaseBloodMastery();
        skills.increaseBloodSkillMastery();
        skills.increaseBloodVolumeMastery();
        skills.increaseClothMastery();
        skills.increaseKnifeMastery();
    }

    private void increaseClericSkills()
    {
        skills.increaseHolyMastery();
        skills.increaseDivinationMastery();
        skills.increaseMaceMastery();
        skills.increaseHealingMastery();
        skills.increaseClothMastery();
    }


    private void increaseDruidSkills()
    {
        skills.increaseAnimalMastery();
        skills.increaseWildShapeMastery();
        skills.increaseNatureMastery();
        skills.increaseMaceMastery();
        skills.increaseDivinationMastery();
    }


}
