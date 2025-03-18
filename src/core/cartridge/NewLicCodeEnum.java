package core.cartridge;

import java.util.HashMap;
import java.util.Map;

enum NewLicCodeEnum {
    ITEM_ONE(0x00, "None"),
    ITEM_TWO(0x01, "Nintendo R&D1"),
    ITEM_THREE(0x08, "Capcom"),
    ELECTRONIC_ARTS(0x13, "Electronic Arts"),
    HUDSON_SOFT(0x18, "Hudson Soft"),
    B_AI(0x19, "b-ai"),
    KSS(0x20, "kss"),
    POW(0x22, "pow"),
    PCM_COMPLETE(0x24, "PCM Complete"),
    SAN_X(0x25, "san-x"),
    KEMCO_JAPAN(0x28, "Kemco Japan"),
    SETA(0x29, "seta"),
    VIACOM(0x30, "Viacom"),
    NINTENDO(0x31, "Nintendo"),
    BANDAI(0x32, "Bandai"),
    OCEAN_ACCLAIM(0x33, "Ocean/Acclaim"),
    KONAMI(0x34, "Konami"),
    HECTOR(0x35, "Hector"),
    TAITO(0x37, "Taito"),
    HUDSON(0x38, "Hudson"),
    BANPRESTO(0x39, "Banpresto"),
    UBI_SOFT(0x41, "Ubi Soft"),
    ATLUS(0x42, "Atlus"),
    MALIBU(0x44, "Malibu"),
    ANGEL(0x46, "angel"),
    BULLET_PROOF(0x47, "Bullet-Proof"),
    IREM(0x49, "irem"),
    ABSOLUTE(0x50, "Absolute"),
    ACCLAIM(0x51, "Acclaim"),
    ACTIVISION(0x52, "Activision"),
    AMERICAN_SAMMY(0x53, "American sammy"),
    KONAMI_ALT(0x54, "Konami"),
    HI_TECH_ENTERTAINMENT(0x55, "Hi tech entertainment"),
    LJN(0x56, "LJN"),
    MATCHBOX(0x57, "Matchbox"),
    MATTEL(0x58, "Mattel"),
    MILTON_BRADLEY(0x59, "Milton Bradley"),
    TITUS(0x60, "Titus"),
    VIRGIN(0x61, "Virgin"),
    LUCASARTS(0x64, "LucasArts"),
    OCEAN(0x67, "Ocean"),
    ELECTRONIC_ARTS_ALT(0x69, "Electronic Arts"),
    INFOGRAMES(0x70, "Infogrames"),
    INTERPLAY(0x71, "Interplay"),
    BRODERBUND(0x72, "Broderbund"),
    SCULPTURED(0x73, "sculptured"),
    SCI(0x75, "sci"),
    THQ(0x78, "THQ"),
    ACCOLADE(0x79, "Accolade"),
    MISAWA(0x80, "misawa"),
    LOZC(0x83, "lozc"),
    TOKUMA_SHOTEN_INTERMEDIA(0x86, "Tokuma Shoten Intermedia"),
    TSUKUDA_ORIGINAL(0x87, "Tsukuda Original"),
    CHUNSOFT(0x91, "Chunsoft"),
    VIDEO_SYSTEM(0x92, "Video system"),
    OCEAN_ACCLAIM_ALT(0x93, "Ocean/Acclaim"),
    VARIE(0x95, "Varie"),
    YONEZAWA_SPAL(0x96, "Yonezawa/s’pal"),
    KANEKO(0x97, "Kaneko"),
    PACK_IN_SOFT(0x99, "Pack in soft"),
    KONAMI_YUGIOH(0xA4, "Konami (Yu-Gi-Oh!)");

    private static final Map<Integer, NewLicCodeEnum> lookup = new HashMap<>();

    static {
        for (NewLicCodeEnum item : NewLicCodeEnum.values())
            lookup.put(item.key, item);
    }

    private final int key;
    private final String value;

    NewLicCodeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static NewLicCodeEnum fromKey(int key) {
        return lookup.get(key);
    }
}

