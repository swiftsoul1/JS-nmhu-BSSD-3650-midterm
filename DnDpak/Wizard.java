package DnDpak;

public class Wizard implements DnDClass {

    //region features
    private final String classFeatures = "Class Features: \n\n" +
            "Spellcasting Ability\n" +
            "Intelligence is your Spellcasting ability for your Wizard Spells since you learn your Spells through dedicated study and memorization. \n" +
            "You use your Intelligence whenever a spell refers to your Spellcasting ability. \n" +
            "In addition you use your Intelligence modifier when Setting the saving throw DC for a Wizard spell you cast and when Making an Attack roll with one.\n" +
            "Spell save DC = 8 + your Proficiency Bonus + your Intelligence modifier\n" +
            "Spell Attack modifier = your Proficiency Bonus + your Intelligence modifier\n" +
            "\n" +
            "Ritual Casting\n" +
            "You can cast a Wizard spell as a ritual if that spell has the ritual tag and you have the spell in your Spellbook. \n" +
            "You don't need to have the spell prepared.\n" +
            "\n" +
            "Spellcasting Focus\n" +
            "You can use an arcane focus as a Spellcasting focus for your Wizard Spells.\n" +
            "\n" +
            "Learning Spells of 1st Level and Higher\n" +
            "Each time you gain a Wizard level you can add two Wizard Spells of your choice to your Spellbook for free. \n" +
            "Each of these Spells must be of a level for which you have Spell Slots, as shown on the Wizard table. \n" +
            "On your Adventures you might find other Spells that you can add to your Spellbook.\n" +
            "\n" +
            "Arcane Recovery\n" +
            "You have learned to regain some of your magical energy by studying your Spellbook. \n" +
            "Once per day when you finish a Short Rest, you can choose expended Spell Slots to recover. \n" +
            "The Spell Slots can have a combined level that is equal to or less than half your Wizard level (rounded up) \n" +
            "and none of the slots can be 6th level or higher.\n" +
            "\n" +
            "Arcane Tradition\n" +
            "When you reach 2nd level you choose an arcane tradition, shaping your practice of magic through one of eight schools such as Evocation. \n" +
            "Your choice grants you features at 2nd level and again at 6th 10th and 14th level.\n" +
            ",\n" +
            "Spell Mastery\n" +
            "At 18th level, you have achieved such mastery over certain Spells that you can cast them at will. \n" +
            "Choose a 1st-level Wizard spell and a 2nd-level Wizard spell that are in your Spellbook. \n" +
            "You can cast those Spells at their lowest level without expending a spell slot when you have them prepared. \n" +
            "If you want to cast either spell at a higher level, you must expend a spell slot as normal.\n" +
            "By spending 8 hours in study, you can exchange one or both of the Spells you chose for different Spells of the same levels.\n" +
            ",\n" +
            "Signature Spells\n" +
            "When you reach 20th level, you gain mastery over two powerful Spells and can cast them with little effort. \n" +
            "Choose two 3rd-level Wizard Spells in your Spellbook as your signature Spells. \n" +
            "You always have these Spells prepared, they don't count against the number of Spells you have prepared \n" +
            "and you can cast each of them once at 3rd level without expending a spell slot. \n" +
            "When you do so, you can't do so again until you finish a short or Long Rest.\n" +
            "If you want to cast either spell at a higher level, you must expend a spell slot as normal.";
    //endregion
    private int level;
    private  String displayClassFeatures;


    //region constructor
    public Wizard() {
        SetLevel(1);
        SplitDisplayString();
    }
    //endregion

    //region methods
    @Override
    public void SplitDisplayString(){
        String[] dispFeat = getClassFeatures().split(",");
        switch(GetLevel()){
            default:
                setDispClassFeats(dispFeat[0]);
                break;
            case 18:
                setDispClassFeats(dispFeat[0]+dispFeat[1]);
                break;
            case 20:
                setDispClassFeats(dispFeat[0]+dispFeat[1]+dispFeat[2]);
                break;
        }
    }


    @Override
    public void LevelUp(){
        SetLevel(GetLevel() +1);
        SplitDisplayString();
    }//method
    //endregion

    //region gets/sets
    //gets
    @Override
    public int GetLevel(){
        return level;
    }

    @Override
    public String getClassFeatures() {
        return classFeatures;
    }

    @Override
    public String getDispClassFeats() {
        return displayClassFeatures;
    }
    @Override
    public String getSubClassFeatures() {
        return "Sub Class Features: \n\n";
    }

    @Override
    public String getDisplaySubClassFeatures() {
        return "";
    }
    //sets
    @Override
    public void setDispClassFeats(String dispClassFeats) {
        this.displayClassFeatures = dispClassFeats;
    }

    @Override
    public void SetLevel(int level){
        this.level = level;
    }

   /* @Override
    public void setClassArch(String Arch){

        super.setClassArch(Arch);

        switch(Arch){

              case "divination":
                Arch = "divination";
                //region setClassArchFeats
                setClassArchFeats("School of Divination\n" +
                        "\n" +
                        "Divination Savant\n" +
                        "Beginning when you select this school at 2nd level\n" +
                        "the gold and time you must spend to copy a divination spell into your spellbook is halved.\n" +
                        "\n" +
                        "Portent\n" +
                        "Starting at 2nd level when you choose this school\n" +
                        "glimpses of the future begin to press in on your awareness.\n" +
                        "When you finish a long rest roll two d20s and record the numbers rolled.\n" +
                        "You can replace any attack roll saving throw or ability check made by you or\n" +
                        "a creature that you can see with one of these foretelling rolls. \n" +
                        "You must choose to do so before the roll and you can replace a roll in this way only once per turn\n" +
                        "Each foretelling roll can be used only once. \n" +
                        "When you finish a long rest you lose any unused foretelling rolls.\n" +
                        ",\n" +
                        "Expert Divination\n" +
                        "Beginning at 6th leveI \n" +
                        "casting divination spells comes so easily to you that it expends only a fraction of your spellcasting efforts.\n" +
                        "When you cast a divination spell of 2nd level or higher using a spell slot you regain one expended spell slot. \n" +
                        "The slot you regain must be of a level lower than the spell you cast and can't be higher than 5th level.\n" +
                        ",\n" +
                        "The Third Eye\n" +
                        "Starting at 10th level\n" +
                        "you can use your action to increase your powers of perception. \n" +
                        "When you do so choose one of the following benefits\n" +
                        "which lasts until you are incapacitated or you take a short or long rest.\n" +
                        "You can't use the feature again until you finish a rest.\n" +
                        "Darkvision. You gain darkvision out to a range of 60 feet as described in chapter 8.\n" +
                        "Ethereal Sight. You can see into the Ethereal Plane within 60 feet of you.\n" +
                        "Greater Comprehension. You can read any language.\n" +
                        "See Invisibility. You can see invisible creatures and objects within 10 feet of you that are within line of sight.\n" +
                        ",\n" +
                        "Greater Portent\n" +
                        "Starting at 14th level\n" +
                        "the visions in your dreams intensify and paint a more accurate picture in your mind of what is to come. \n" +
                        "You roll three d20s for your Portent feature rather than two.\n" +
                        "\n" +
                        "\n");
                //endregion
                break;
            case "abjuration":
                Arch = "abjuration";
                //region setClassArchFeats
                setClassArchFeats("School of Abjuration\n" +
                        "\n" +
                        "The School of Abjuration emphasizes magic that blocks banishes or protects.\n" +
                        "Detractors of this school say that its tradition is about denial\n" +
                        "negation rather than positive assertion. You understand however that ending harmful effects\n" +
                        "protecting the weak and banishing evil influences is anything but a philosophical void.\n" +
                        "It is a proud and respected vocation.\n" +
                        "\n" +
                        "Called abjurers members of this school are sought when baleful spirits require exorcism\n" +
                        "when important locations must be guarded against magical spying\n" +
                        "and when portals to other planes of existence must be closed.\n" +
                        "\n" +
                        "\n" +
                        "ABJURATION SAVANT\n" +
                        "Beginning when you select this school at 2nd level\n" +
                        "the gold and time you must spend to copy an abjuration spell into your spellbook is halved.\n" +
                        "\n" +
                        "ARCANE WARD\n" +
                        "Starting at 2nd level\n" +
                        "you can weave magic around yourself for protection. \n" +
                        "When you cast an abjuration spell of 1st level or higher\n" +
                        "you can simultaneously use a strand of the spell's magic to\n" +
                        " create a magical ward on yourself that lasts until you finish a long rest.\n" +
                        "The ward has hit points equal to twice your wizard level + your Intelligence modifier. \n" +
                        "Whenever you take damage the ward takes the damage instead. \n" +
                        "If this damage reduces the ward to 0 hit points you take any remaining damage.\n" +
                        "While the ward has 0 hit points it can't absorb damage but its magic remains. \n" +
                        "Whenever you cast an abjuration spell of 1st level or higher\n" +
                        "the ward regains a number of hit points equal to twice the level of the spell.\n" +
                        "Once you create the ward\n" +
                        "you can't create it again until you finish a long rest.\n" +
                        ",\n" +
                        "PROJECTED WARD\n" +
                        "Starting at 6th level\n" +
                        "when a creature that you can see within 10 metres of you takes damage\n" +
                        "you can use your reaction to cause your Arcane Ward to absorb that damage.\n" +
                        "If this damage reduces the ward to 0 hit points the warded creature takes any remaining damage.\n" +
                        ",\n" +
                        "IMPROVED ABJURATION\n" +
                        "Beginning at 10th level\n" +
                        "when you cast an abjuration spell that requires you to make an ability check as a part of casting that spell\n" +
                        "(as in counterspell and dispel magic) you add your proficiency bonus to that ability check.\n" +
                        ",\n" +
                        "SPELL RESISTANCE\n" +
                        "Starting at 14th level\n" +
                        "you have advantage on saving throws against spells.\n" +
                        "Furthermore you have +1 resistance to damage from spells. \n" +
                        "This feature can not increase your resistance above 1.");
                //endregion
                break;
            case "illusion":
                Arch = "illusion";
                //region setClassArchFeat
                setClassArchFeats("School of Illusion\n" +
                        "\n" +
                        "You focus your studies on magic that dazzles the senses\n" +
                        "befuddles the mind, and tricks even the wisest folk.\n" +
                        "Your magic is subtle but the illusions crafted by your keen mind make the impossible seem real.\n" +
                        "Some illusionists – including many gnome wizards – are benign tricksters who use their spells to entertain.\n" +
                        "Others are more sinister masters of deception using their illusions to frighten and fool others for their personal gain.\n" +
                        "\n" +
                        "Illusion Savant\n" +
                        "Beginning when you select this school at 2nd level\n" +
                        "the gold and time you must spend to copy a Illusion spell into your spellbook is halved.\n" +
                        "\n" +
                        "Improved Minor Illusion\n" +
                        "When you choose this school at 2nd level\n" +
                        "you learn the Minor Illusion cantrip. If you already know this cantrip\n" +
                        "you learn a different wizard cantrip of your choice. \n" +
                        "The cantrip doesn't count against your number of cantrips known.\n" +
                        "When you cast Minor Illusion\n" +
                        "you can create both a sound and an image with a single casting of the spell.\n" +
                        ",\n" +
                        "Malleable Illusions\n" +
                        "Starting at 6th level \n" +
                        "when you cast an illusion spell that has a duration of 1 minute or longer\n" +
                        "you can use your action to change the nature of that illusion (using the spell's normal parameters for the illusion)\n" +
                        "provided that you can see the illusion.\n" +
                        ",\n" +
                        "Illusory Self\n" +
                        "Beginning at 10th level\n" +
                        "you can create an illusory duplicate of yourself as an instant almost instinctual reaction to danger.\n" +
                        "When a creature makes an attack roll against you\n" +
                        "you can use your reaction to interpose the illusory duplicate between the attacker and yourself.\n" +
                        "The attack automatically misses you then the illusion dissipates.\n" +
                        "Once you use this feature you can't use it again until you finish a short or long rest.\n" +
                        ",\n" +
                        "Illusory Reality\n" +
                        "By 14th level\n" +
                        "you have learned the secret of weaving shadow magic into your illusions to give them a semi-reality.\n" +
                        "When you cast an illusion spell of 1st level or higher you can choose one inanimate \n" +
                        "nonmagical object that is part of the illusion and make that object real. \n" +
                        "You can do this on your turn as a bonus action while the spell is ongoing. \n" +
                        "The object remains real for 1 minute. \n" +
                        "The object can't deal damage or otherwise directly harm anyone.");
                //endregion
                break;
            case "evocation":
                Arch = "evocation";
                //region setClassArchFeats
                setClassArchFeats( "School of Evocation\n" +
                        "You focus your study on magic that creates powerful elemental Effects such as bitter cold searing flame rolling thunder crackling lightning and burning acid. \n" +
                        "Some evokers find employment in military forces serving as artillery to blast enemy armies from afar. \n" +
                        "Others use their spectacular power to protect the weak while some seek their own gain as bandits adventurers or aspiring tyrants.\n" +
                        "\n" +
                        "Evocation Savant\n" +
                        "Beginning when you select this school at 2nd level " +
                        "the gold and time you must spend to copy an Evocation spell into your Spellbook is halved.\n" +
                        "\n" +
                        "Sculpt Spells\n" +
                        "Beginning at 2nd level " +
                        "you can create pockets of relative safety within the Effects of your Evocation Spells. " +
                        "When you cast an Evocation spell that affects other creatures that you can see\n" +
                        "you can choose a number of them equal to 1 + the spell’s level. " +
                        "The chosen creatures automatically succeed on their Saving Throws against the spell\n" +
                        "and they take no damage if they would normally take half damage on a successful save.\n" +
                        ",\n" +
                        "Potent Cantrip\n" +
                        "Starting at 6th level " +
                        "your damaging Cantrips affect even creatures that avoid the brunt of the effect. When a creature succeeds on a saving throw against your cantrip\n" +
                        "the creature takes half the cantrip’s damage (if any) but suffers no additional effect from the cantrip.\n" +
                         ",\n" +
                        "Empowered Evocation\n" +
                        "Beginning at 10th level" +
                        "you can add your Intelligence modifier to one damage roll of any Wizard Evocation spell you cast.\n" +
                        ",\n" +
                        "Overchannel\n" +
                        "Starting at 14th level " +
                        "you can increase the power of your simpler Spells. " +
                        "When you cast a Wizard spell of 1st through 5th level that deals damage you can deal maximum damage with that spell.\n" +
                        "The first time you do so you suffer no adverse effect. If you use this feature again before you finish a Long Rest you take 2d12 necrotic damage for each level of the spell\n" +
                        "immediately after you cast it. Each time you use this feature again before finishing a Long Rest " +
                        "the necrotic damage per Spell Level increases by 1d12. This damage ignores Resistance and immunity.");
                //endregion
                break;
            case "conjuration":
                Arch = "conjuration";
                //region setClassArchFeats
                setClassArchFeats("School of Conjuration\n" +
                        "\n" +
                        "As a conjurer you favor spells that produce objects and creatures out of thin air.\n" +
                        "You can conjure billowing clouds of killing fog or summon creatures from elsewhere to fight on your behalf.\n" +
                        "As your mastery grows you learn spells of transportation and can teleport yourself across vast distances\n" +
                        "even to other planes of existence in an instant.\n" +
                        "\n" +
                        "Conjuration Savant\n" +
                        "Beginning when you select this school at 2nd level\n" +
                        "the gold and time you must spend to copy a Conjuration spell into your spellbook is halved.\n" +
                        "\n" +
                        "Minor Conjuration\n" +
                        "Starting at 2nd level when you select this school\n" +
                        "you can use your action to conjure up an inanimate object in your hand \n" +
                        "or on the ground in an unoccupied space that you can see within 10 feet of you. \n" +
                        "This object can be no larger than 3 feet on a side and weigh no more than 10 pounds \n" +
                        "and its form must be that of a nonmagical object that you have seen. \n" +
                        "The object is visibly magical radiating dim light out to 5 feet.\n" +
                        "The object disappears after 1 hour when you use this feature again or if it takes any damage.\n" +
                        "\n," +
                        "Benign Transportation\n" +
                        "Starting at 6th level \n" +
                        "you can use your action to teleport up to 30 feet to an unoccupied space that you can see.\n" +
                        "Alternatively you can choose a space within range that is occupied by a Small or Medium creature.\n" +
                        "If that creature is willing you both teleport swapping places.\n" +
                        "Once you use this feature you can't use it again until you finish a long rest \n" +
                        "or you cast a conjuration spell of 1st level or higher.\n" +
                        "\n," +
                        "Focused Conjuration\n" +
                        "Beginning at 10th level\n" +
                        "while you are concentrating on a conjuration spell\n" +
                        "your concentration can't be broken as a result of taking damage.\n" +
                        "\n," +
                        "Durable Summons\n" +
                        "Starting at 14th level\n" +
                        "any creature that you summon or create with a conjuration spell has 30 temporary hit points.");
                //endregion
                break;
            case "enchantment":
                Arch = "enchantment";
                //region setClassArchFeats
                setClassArchFeats("School of Enchantment\n" +
                        "\n" +
                        "As a member of the School of Enchantment\n" +
                        "you have honed your ability to magically entrance and beguile other people and monsters.\n" +
                        "Some enchanters are peacemakers w ho bewitch the violent to lay down their arms and charm the cruel into showing mercy.\n" +
                        "Others are tyrants who magically bind the unwilling into their service. Most enchanters fall somewhere in between.\n" +
                        "\n" +
                        "ENCHANTMENT SAVANT\n" +
                        "Beginning when you select this school at 2nd level\n" +
                        "the gold and time you must spend to copy an enchantment spell into your spellbook is halved.\n" +
                        "\n" +
                        "HYPNOTIC GAZE\n" +
                        "Starting at 2nd level when you choose this school \n" +
                        "your soft words and enchanting gaze can magically enthrall another creature.\n" +
                        "As a full action choose one creature that you can see within 2 metres of you.\n" +
                        "If the target can see or hear you it must succeed on a Wisdom saving throw against your wizard spell save DC\n" +
                        "or be charmed by you until the end of your next turn. \n" +
                        "The charmed creature's speed drops to 0 and the creature is incapacitated and visibly dazed.\n" +
                        "On subsequent turns you can use your full action to maintain this effect \n" +
                        "extending its duration until the end of your next turn.\n" +
                        "However the effect ends if you move more than 2 metres away from the creature \n" +
                        "if the creature can neither see nor hear you or if the creature takes damage.\n" +
                        "Once the effect ends or if the creature succeeds on its initial saving throw against this effect\n" +
                        "you can't use this feature on that creature again until you finish a long rest.\n" +
                        ",\n" +
                        "INSTINCTIVE CHARM\n" +
                        "Beginning at 6th level\n" +
                        "when a creature you can see within 10 metres of you makes an attack roll against you \n" +
                        "you can use your reaction to divert the attack provided that another creature is within the attack’s range.\n" +
                        "The attacker must make a Wisdom saving throw against your wizard spell save DC. \n" +
                        "On a failed save the attacker must target the creature that is closest to it\n" +
                        "not including you or itself. If multiple creatures are closest the attacker chooses which one to target.\n" +
                        "On a successful save you can't use this feature on the attacker again until you finish a long rest.\n" +
                        "You must choose to use this feature before knowing whether the attack hits or misses. \n" +
                        "Creatures that can't be charmed are immune to this effect.\n" +
                        ",\n" +
                        "SPLIT ENCHANTMENT\n" +
                        "Starting at 10th level\n" +
                        "when you cast an enchantment spell of 1st level or higher that targets only one creature \n" +
                        "you can have it target a second creature.\n" +
                        ",\n" +
                        "ALTER MEMORIES\n" +
                        "At 14th level \n" +
                        "you gain the ability to make a creature unaware of your magical influence on it. \n" +
                        "When you cast an enchantment spell to charm one or more creatures \n" +
                        "you can alter one creature's understanding so that it remains unaware of being charmed.\n" +
                        "Additionally once before the spell expires\n" +
                        "you can use your action to try to make the chosen creature forget some of the time it spent charmed.\n" +
                        "The creature must succeed on an Intelligence saving throw against your wizard spell save DC or\n" +
                        "lose a number of hours of its memories equal to 1 + your Charisma modifier (minimum 1).\n" +
                        "You can make the creature forget less time and the amount of time can't exceed the duration of your enchantment spell.");
                //endregion
                break;
            case "transmutation":
                Arch = "transmutation";
                //region setClassArchFeats
                setClassArchFeats("School of Transmutation\n" +
                        "\n" +
                        "You are a student of spells that modify energy and matter.\n" +
                        "To you the world is not a fixed thing but eminently mutable\n" +
                        "and you delight in being an agent of change. \n" +
                        "You wield the raw stuff of creation and learn to alter both physical forms and mental qualities.\n" +
                        "Your magic gives you the tools to become a smith on reality's forge. Some transmuters are tinkerers and pranksters\n" +
                        "turning people into toads and transforming copper into silver for fun and occasional profit. \n" +
                        "Others pursue their magical studies with deadly seriousness seeking the power of the gods to make and destroy worlds.\n" +
                        "\n" +
                        "Transmutation Savant\n" +
                        "Beginning when you select this school at 2nd level\n" +
                        "the gold and time you must spend to copy a Transmutation spell into your spellbook is halved.\n" +
                        "\n" +
                        "Minor Alchemy\n" +
                        "Starting at 2nd level when you select this school\n" +
                        "you can temporarily alter the physical properties of one nonmagical object\n" +
                        "changing it from one substance into another.\n" +
                        "You perform a special alchemical procedure on one object composed entirely of wood stone \n" +
                        "(but not a gemstone) iron copper or silver transforming it into a different one of those materials. \n" +
                        "For each 10 minutes you spend performing the procedure you can transform up to 1 cubic foot of material.\n" +
                        "After 1 hour or until you lose your concentration (as if you were concentrating on a spell)\n" +
                        "the material reverts to its original substance.\n" +
                        ",\n" +
                        "Transmuter's Stone\n" +
                        "Starting at 6th level \n" +
                        "you can spend 8 hours creating a transmuter's stone that stores transmutation magic. \n" +
                        "You can benefit from the stone yourself or give it to another creature. \n" +
                        "A creature gains a benefit of your choice as long as the stone is in the creature's possession. \n" +
                        "When you create the stone choose the benefit from the following options:\n" +
                        "• Darkvision out to a range of 60 feet\n" +
                        "• An increase to speed of 10 feet while the creature is unencumbered\n" +
                        "• Proficiency in Constitution saving throws\n" +
                        "• Resistance to acid cold fire lightning or thunder damage (your choice whenever you choose this benefit)\n" +
                        "Each time you cast a transmutation spell of 1st level or higher\n" +
                        "you can change the effect of your stone if the stone is on your person.\n" +
                        "If you create a new transmuter's stone the previous one ceases to function.\n" +
                        ",\n" +
                        "Shapechanger\n" +
                        "At 10th level \n" +
                        "you add the Polymorph spell to your spellbook if it is not there already.\n" +
                        "You can cast Polymorph without expending a spell slot. When you do so\n" +
                        "you can target only yourself and transform into a beast whose challenge rating is 1 or lower.\n" +
                        "Once you cast Polymorph in this way \n" +
                        "you can't do so again until you finish a short or long rest\n" +
                        "though you can still cast it normally using an available spell slot.\n" +
                        ",\n" +
                        "Master Transmuter\n" +
                        "Starting at 14th level \n" +
                        "you can use your action to consume the reserve of transmutation magic\n" +
                        "stored within your transmuter's stone in a single burst. When you do so choose one of the following effects.\n" +
                        "Your transmuter's stone is destroyed and can't be remade until you finish a long rest.\n" +
                        "Major Transformation. \n" +
                        "You can transmute one nonmagical object – no larger than a 5-foot cube – \n" +
                        "into another nonmagical object of similar size and mass and of equal or lesser value. You must spend 10 minutes handling the object to transform it.\n" +
                        "Panacea. \n" +
                        "You remove all curses diseases and poisons affecting a creature that you touch with the transmuter's stone.\n" +
                        "The creature also regains all its hit points.\n" +
                        "Restore Life.\n" +
                        "You cast the Raise Dead spell on a creature you touch with the transmuter's stone\n" +
                        "without expending a spell slot or needing to have the spell in your spellbook.\n" +
                        "Restore Youth. \n" +
                        "You touch the transmuter's stone to a willing creature and that creature's apparent age is reduced by 3d10 years\n" +
                        "to a minimum of 13 years. This effect doesn't extend the creature's lifespan.");
                //endregion
                break;
            case "war magic":
                Arch = "war magic";
                //region setClassArchFeats
                setClassArchFeats("School of War Magic\n" +
                        "\n" +
                        "A variety of arcane colleges specialize in training wizards for war. \n" +
                        "The tradition of War Magic blends principles of evocation and abjuration\n" +
                        "rather than specializing in either of those schools. It teaches techniques that empower a caster’s spells\n" +
                        "while also providing methods for wizards to bolster their own defenses.\n" +
                        "Followers of this tradition are known as war mages. \n" +
                        "They see their magic as both a weapon and armor a resource superior to any piece of steel.\n" +
                        "War mages act fast in battle using their spells to seize tactical control of a situation. \n" +
                        "Their spells strike hard while their defensive skills foil their opponents’ attempts to counterattack. \n" +
                        "War mages are also adept at turning other spellcasters' magical energy against them.\n" +
                        "In great battles a war mage often works with evokers abjurers and other types of wizards.\n" +
                        "Evokers in particular sometimes tease war mages for splitting their attention between offense and defense. \n" +
                        "\n" +
                        "Arcane Deflection\n" +
                        "At 2nd level\n" +
                        "you have learned to weave your magic to fortify yourself against harm. \n" +
                        "When you are hit by an attack or you fail a saving throw\n" +
                        "you can use your reaction to gain a +2 bonus to your AC against that attack or a +4 bonus to that saving throw.\n" +
                        "When you use this feature you can’t cast spells other than cantrips until the end of your next turn.\n" +
                        "\n" +
                        "Tactical Wit\n" +
                        "Starting at 2nd level\n" +
                        "your keen ability to assess tactical situations allows you to act quickly in battle. \n" +
                        "You can give yourself a bonus to your initiative rolls equal to your Intelligence modifier.\n" +
                        ",\n" +
                        "Power Surge\n" +
                        "Starting at 6th level\n" +
                        "you can store magical energy within yourself to later empower your damaging spells.\n" +
                        "You can store a maximum number of power surges equal to your Intelligence modifier (minimum of one). \n" +
                        "Whenever you finish a long rest your number of power surges resets to one. \n" +
                        "Whenever you successfully end a spell with Dispel Magic or Counterspell you gain one power surge as you steal magic from the spell you foiled.\n" +
                        "If you end a short rest with no power surges you gain one power surge.\n" +
                        "Once per turn when you deal damage to a creature or object with a wizard spell\n" +
                        "you can spend one power surge to deal extra force damage to that target. \n" +
                        "The extra damage equals half your wizard level.\n" +
                        ",\n" +
                        "Durable Magic\n" +
                        "Beginning at 10th level\n" +
                        "the magic you channel helps ward off harm. While you maintain concentration on a spell you have a +2 bonus to AC and all saving throws.\n" +
                        ",\n" +
                        "Deflecting Shroud\n" +
                        "At 14th level\n" +
                        "your Arcane Deflection becomes infused with deadly magic. \n" +
                        "When you use your Arcane Deflection feature you can cause magical energy to arc from you. \n" +
                        "Up to three creatures of your choice within 60 feet of you each take force damage equal to half your wizard level.");
                //endregion
                break;
            case "theurgy":
                Arch = "theurgy";
                //region setClassArchFeats
                setClassArchFeats("School of Theurgy\n" +
                        "\n" +
                        "A number of deities claim arcane magic as their domain \n" +
                        "for magic is as much a part of the fabric of the cosmos as wind fire lightning and all other primal forces.\n" +
                        "Just as there are deities of the sea and gods of warfare the arcane arts feature their own divine patrons.\n" +
                        "Such deities often have clerics but many gods of magic bid their followers to take up the study of wizardry. \n" +
                        "These religious magic-users follow the arcane tradition of Theurgy and are commonly known as theurgists. \n" +
                        "Such spellcasters are as dedicated and scholarly as any other wizard but they blend their arcane study with religious devotion.\n" +
                        "\n" +
                        "Divine Inspiration\n" +
                        "When you choose this tradition at 2nd level\n" +
                        "choose a cleric domain from your chosen deity’s list of eligible domains. \n" +
                        "The Knowledge and Light domains are especially appropriate choices for a theurgist.\n" +
                        "\n" +
                        "Arcane Initiate\n" +
                        "Beginning when you select this tradition at 2nd level \n" +
                        "whenever you gain a wizard level you can replace one of the wizard spells you add to your spellbook with a \n" +
                        "cleric domain spell for your chosen domain. The spell must be of a level for which you have spell slots.\n" +
                        "If you add all of your domain spells to your spellbook you can subsequently add any spell from the cleric spell list instead. \n" +
                        "The spell must still be of a level for which you have spell slots.\n" +
                        "Any cleric spell you gain from this feature is considered a wizard spell for you\n" +
                        "but other wizards can’t copy cleric spells from your spellbook into their own spellbooks.\n" +
                        "\n" +
                        "Channel Arcana\n" +
                        "At 2nd level\n" +
                        "you gain the ability to channel arcane energy directly from your deity using that energy to fuel magical effects. \n" +
                        "You start with two such effects: Divine Arcana and the Channel Divinity option granted at 2nd level by your chosen domain. \n" +
                        "You employ that Channel Divinity option by using your Channel Arcana ability.\n" +
                        "When you use your Channel Arcana you choose which effect to create. \n" +
                        "You must then finish a short or long rest to use your Channel Arcana again.\n" +
                        "Some Channel Arcana effects require saving throws. When you use such an effect the save DC equals your wizard spell save DC.\n" +
                        "Beginning at 6th level\n" +
                        "you can use your Channel Arcana twice between rests and beginning at 18th level you can use it three times between rests. \n" +
                        "When you finish a short or long rest you regain your expended uses.\n" +
                        "If you gain additional Channel Divinity options from your domain you can employ them by using your Channel Arcana feature.\n" +
                        "\n" +
                        "Channel Arcana: Divine Arcana\n" +
                        "As a bonus action you speak a prayer to control the flow of magic around you. \n" +
                        "The next spell you cast gains a +2 bonus to any attack roll you make for it or to its saving throw DC as appropriate.\n" +
                        ",\n" +
                        "Arcane Acolyte\n" +
                        "At 6th level you gain your chosen domain’s 1st-level benefits. \n" +
                        "However you do not gain any weapon or armor proficiencies from the domain.\n" +
                        ",\n" +
                        "Arcane Priest\n" +
                        "At 10th level\n" +
                        "you gain your chosen domain’s 6th-level benefits. \n" +
                        "Your faith and your understanding of magic allow you to delve into your god’s secrets.\n" +
                        ",\n" +
                        "Arcane High Priest\n" +
                        "At 14th level\n" +
                        "you gain your chosen domain’s 17th-level benefits. \n" +
                        "Your academic nature and understanding of magic and doctrine allow you to master this ability sooner than a cleric of your domain.");
                //endregion
                break;
            case "bladesinger":
                Arch = "bladesinger";
                //region setClassArchFeats
                setClassArchFeats("Bladesinger\n" +
                        "\n" +
                        "Bladesingers are elves who bravely defend their people and lands. \n" +
                        "They are elf wizards who master a school of sword fighting grounded in a tradition of arcane magic. \n" +
                        "In combat a bladesinger uses a series of intricate elegant maneuvers \n" +
                        "that fend off harm and allow the bladesinger to channel magic into devastating attacks and a cunning defense.\n" +
                        "Styles of Bladesinging are broadly categorized based on the type of weapon employed and each is associated with a category of animal. \n" +
                        "Within that style are specializations named after specific animal types \n" +
                        "based on the types of spells employed the techniques of the master and the particular weapon used.\n" +
                        "Styles that employ a sword belong to the Cat family including the longsword-wielding Lion style and the scimitar-wielding Red Tiger style. \n" +
                        "Styles that focus on the use of hafted weapons belong to the Bird family including the handaxe-throwing Eagle style or warpick-wielding Raven style.\n" +
                        "Styles that use whips chains or flails are included in the Snake style family such as the whip-wielding Viper style.\n" +
                        "Bladesingers who apprentice to a master typically get a tattoo of their chosen style's animal. \n" +
                        "Some bladesingers learn multiple styles and bear many tattoos wearing a warning on their skin of their deadly skills.\n" +
                        "\n" +
                        "Training in War and Song\n" +
                        "When you adopt this tradition at 2nd level \n" +
                        "you gain proficiency with light armor and you gain proficiency with one type of one-handed melee weapon of your choice.\n" +
                        "You also gain proficiency in the Performance skill if you don't already have it.\n" +
                        "\n" +
                        "Bladesong\n" +
                        "Starting at 2nd level\n" +
                        "you can invoke a secret elven magic called the Bladesong provided that you aren't wearing medium or heavy armor or using a shield. \n" +
                        "It graces you with supernatural speed agility and focus.\n" +
                        "You can use a bonus action to start the Bladesong which lasts for 1 minute. \n" +
                        "It ends early if you are incapacitated if you don medium or heavy armor or a shield or if you use two hands to make an attack with a weapon.\n" +
                        "You can also dismiss the Bladesong at any time you choose (no action required).\n" +
                        "While your Bladesong is active you gain the following benefits:\n" +
                        "• You gain a bonus to your AC equal to your Intelligence modifier (minimum of +1).\n" +
                        "• Your walking speed increases by 10 feet.\n" +
                        "• You have advantage on Dexterity (Acrobatics) checks.\n" +
                        "• You gain a bonus to any Constitution saving throw you make to maintain your concentration on a spell. The bonus equals your Intelligence modifier (minimum of +1).\n" +
                        "You can use this feature twice. You regain all expended uses of it when you finish a short or long rest.\n" +
                        ",\n" +
                        "Extra Attack\n" +
                        "Starting at 6th level\n" +
                        "you can attack twice instead of once whenever you take the Attack action on your turn.\n" +
                        ",\n" +
                        "Song of Defense\n" +
                        "Beginning at 10th level\n" +
                        "you can direct your magic to absorb damage while your Bladesong is active. \n" +
                        "When you take damage you can use your reaction to expend one spell slot \n" +
                        "and reduce that damage to you by an amount equal to five times the spell slot's level.\n" +
                        ",\n" +
                        "Song of Victory\n" +
                        "Starting at 14th level\n" +
                        "you add your Intelligence modifier (minimum of +1) to the damage of your melee weapon attacks while your Bladesong is active.\n");
                //endregion
                break;
            case "technomancy":
                Arch = "technomancy";
                //region setClassArchFeats
                setClassArchFeats("School of Technomancy\n" +
                        "\n" +
                        "Unlike the more common arcane traditions based around the schools of magic the tradition\n" +
                        "of Technomancy does not focus on a singular type of spellcraft or magical energy.\n" +
                        "Rather students of Technomancy concern themselves with how their spells interact with modern technology.\n" +
                        "Technomancers can make use of technology as both a conduit and a storage space for magic. \n" +
                        "In a campaign using the optional rules for magic item creation(see theDungeon'Master’s'Guide)\n" +
                        "a technomancer might craft disposable electronic devices and smartphone apps in lieu of potions and scrolls.\n" +
                        "\n" +
                        "Bonus Proficiencies\n" +
                        "Beginning when you select this arcane tradition at 2nd level\n" +
                        "you gain proficiency with sidearms and hacking tools.\n" +
                        "\n" +
                        "Technological Savant\n" +
                        "at 2nd level \n" +
                        "you trade out your spellbook for a specially attuned storage device of your\n" +
                        "choosing capable of recording magical data. The computing power of this device must be equal to\n" +
                        "or greater than a tablet computer. Only one storage device can be attuned to you at any given time.\n" +
                        "Spells can be copied into this device at half the cost of copying spells into a spellbook.\n" +
                        ",\n" +
                        "Program Spell\n" +
                        "At 6th level \n" +
                        "you can insert a spell within an electronic device of your choosing so that by touching a key or flicking\n" +
                        "a switch using an action the spell activates. All variables of the spell are set at the time of casting.\n" +
                        "The computing power of this device must be equal to or greater than a mobile phone.\n" +
                        "A programmed spell remains placed in its device for 48 hours and is gone once it is discharged.\n" +
                        "You can use this feature to place a programmed spell in only one device at a time\n" +
                        "and a device can hold only one programmed spell. \n" +
                        "Only you can activate the programmed spell in the device. If the device is destroyed the programmed spell is lost.\n" +
                        "A concentration spell placed in a device cannot be activated while you are concentrating on another spell.\n" +
                        "Once you use this feature you can’t use it again until you finish a long rest.\n" +
                        ",\n" +
                        "Online Casting\n" +
                        "At 10th level\n" +
                        "you can cast spells through networked electronic devices including cameras mobile phones and computers.\n" +
                        "If the spell requires the caster to be seen the target must see you or a live image of you. \n" +
                        "If the spell requires the caster to be heard the target must be able to hear you or a live audio transmission of you.\n" +
                        "The spell’s range is determined using the distance from you to your device and then from the target to its device.\n" +
                        "You must be able to see or otherwise determine the location of the target. \n" +
                        "This feature can be used to cast only spells that target specific creatures. \n" +
                        "Spells that affect an area are not subject to online casting. \n" +
                        "This feature can be used a number of times per day equal to your Intelligence modifier(minimum of once).\n" +
                        ",\n" +
                        "Chained Device\n" +
                        "By 14th level \n" +
                        "you have learned to imprint vestiges of your consciousness on electronic devices with significant computing power.\n" +
                        "When you cast a concentration spell you can use a device whose computing power is equal to \n" +
                        "or greater than a tablet computer to maintain concentration of the spell on your behalf.\n" +
                        "The device must be held or worn by you to maintain this effect.\n" +
                        "If the device is destroyed taken from you dropped or turned off the concentration ends.\n" +
                        "Once you use this feature you can’t use it again until you finish a long rest.");
                //endregion
                break;
            case "lore mastery":
                Arch = "lore mastery";
                //region setClassArchFeats
                setClassArchFeats("Lore Master\n" +
                        "\n" +
                        "Starting at 2nd level\n" +
                        "you become a compendium\tof knowledge on a vast array of\ttopics.\n" +
                        "Your proficiency bonus is doubled for any ability check you make that uses the \n" +
                        "Arcana History Nature or Religion skill if you are proficient in that skill.\n" +
                        "In addition your analytical abilities are so well-honed that your initiative in combat can be \n" +
                        "driven by mental agility rather than physical agility. When you roll initiative\n" +
                        "it is either an Intelligence check or a Dexterity check for you (your choice).\n" +
                        "\n" +
                        "Spell Secrets\n" +
                        "At 2nd level\n" +
                        "you master the first in a series of arcane secrets uncovered by\tyour extensive studies.\n" +
                        "When you cast a spell with a spell slot and the\tspell deals acid cold fire force lightning necrotic radiant \n" +
                        "or thunder damage you can substitute that damage type with one other type from that list \n" +
                        "(you can change only one damage type per casting of a spell).\n" +
                        "You replace one energy type for another by altering the spell’s formula as you cast it.\n" +
                        "When you cast a spell with a spell slot and the spell requires a saving\tthrow you can change the\n" +
                        "saving throw from one ability score to another of your choice.\n" +
                        "Once you change\ta saving throw in this way you can’t do so again until you finish a short or long rest.\n" +
                        ",\n" +
                        "Alchemical Casting\n" +
                        "At 6th level \n" +
                        "you learn to augment spells in a variety of ways. When you cast a spell with a spell slot\n" +
                        "you can expend one additional spell slot to augment its effects for this casting mixing the\n" +
                        "raw stuff of magic into your spell to amplify it. The effect depends on the spell slot you expend.\n" +
                        "An additional 1st-level spell slot can increase the spell’s raw force. \n" +
                        "If you roll damage for the spell when you cast it increase the damage against every target by 2d10 force damage. \n" +
                        "If the spell can deal damage on more than one turn\n" +
                        "it deals this extra force damage only on the turn you cast the spell. \n" +
                        "An additional 2nd-level spell slot can increase the spell’s range. \n" +
                        "If the spell’s range is at least 30 feet it becomes 1 mile.\n" +
                        "An additional 3rd-level spell slot can increase the spell’s potency.\n" +
                        "Increase the spell’s save DC by 2.\n" +
                        ",\n" +
                        "Prodigious Memory\n" +
                        "At 10th level\n" +
                        "you have attained a greater mastery of spell preparation. As a bonus action you can replace\n" +
                        "one spell you have prepared with another spell from your spellbook. \n" +
                        "You can’t use this feature again until you finish a short or long rest.\n" +
                        ",\n" +
                        "Master of Magic \n" +
                        "At 14th level\t\n" +
                        "your knowledge of magic allows you to duplicate almost any spell. As a bonus action\n" +
                        "you can call to mind the ability to cast one spell of your choice from any class’s spell list. \n" +
                        "The spell must be of a level for which you have\tspell slots you mustn’t have it prepared and you follow\n" +
                        "the normal rules for casting it including expending a spell slot.\n" +
                        "If the spell isn’t a wizard spell it counts as a wizard spell when you cast it. \n" +
                        "The ability to cast the spell vanishes from your mind when you cast it or when the current turn ends. \n" +
                        "You can’t use this feature again until you finish a long rest.");
                //endregion
                break;
        }//switch


    }//method*/


    //endregion

}//class
