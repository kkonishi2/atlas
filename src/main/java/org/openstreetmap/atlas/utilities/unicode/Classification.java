package org.openstreetmap.atlas.utilities.unicode;

import org.openstreetmap.atlas.utilities.unicode.Classification.CodeBlock;

/**
 * How many different Unicode CodeBlocks are found in a CharSequence?
 *
 * @author cstaylor
 */
public interface Classification extends Iterable<CodeBlock>
{
    /**
     * Code blocks as enum constants, pulled from Character.UnicodeBlock and some simplified names
     * we use for core.
     *
     * @author cstaylor
     */
    enum CodeBlock
    {
        /**
         * These codes are from Character.UnicodeBlock, and they follow the Unicode Standard
         */
        AEGEAN_NUMBERS,
        ALCHEMICAL_SYMBOLS,
        ALPHABETIC_PRESENTATION_FORMS,
        ANCIENT_GREEK_MUSICAL_NOTATION,
        ANCIENT_GREEK_NUMBERS,
        ANCIENT_SYMBOLS,
        ARABIC,
        ARABIC_EXTENDED_A,
        ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS,
        ARABIC_PRESENTATION_FORMS_A,
        ARABIC_PRESENTATION_FORMS_B,
        ARABIC_SUPPLEMENT,
        ARMENIAN,
        ARROWS,
        AVESTAN,
        BALINESE,
        BAMUM,
        BAMUM_SUPPLEMENT,
        BASIC_LATIN,
        BATAK,
        BENGALI,
        BLOCK_ELEMENTS,
        BOPOMOFO,
        BOPOMOFO_EXTENDED,
        BOX_DRAWING,
        BRAHMI,
        BRAILLE_PATTERNS,
        BUGINESE,
        BUHID,
        BYZANTINE_MUSICAL_SYMBOLS,
        CARIAN,
        CHAKMA,
        CHAM,
        CHEROKEE,
        CJK_COMPATIBILITY,
        CJK_COMPATIBILITY_FORMS,
        CJK_COMPATIBILITY_IDEOGRAPHS,
        CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT,
        CJK_RADICALS_SUPPLEMENT,
        CJK_STROKES,
        CJK_SYMBOLS_AND_PUNCTUATION,
        CJK_UNIFIED_IDEOGRAPHS,
        CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A,
        CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B,
        CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C,
        CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D,
        COMBINING_DIACRITICAL_MARKS,
        COMBINING_DIACRITICAL_MARKS_SUPPLEMENT,
        COMBINING_HALF_MARKS,
        COMBINING_MARKS_FOR_SYMBOLS,
        COMMON_INDIC_NUMBER_FORMS,
        CONTROL_PICTURES,
        COPTIC,
        COUNTING_ROD_NUMERALS,
        CUNEIFORM,
        CUNEIFORM_NUMBERS_AND_PUNCTUATION,
        CURRENCY_SYMBOLS,
        CYPRIOT_SYLLABARY,
        CYRILLIC,
        CYRILLIC_EXTENDED_A,
        CYRILLIC_EXTENDED_B,
        CYRILLIC_SUPPLEMENTARY,
        DESERET,
        DEVANAGARI,
        DEVANAGARI_EXTENDED,
        DINGBATS,
        DOMINO_TILES,
        EGYPTIAN_HIEROGLYPHS,
        EMOTICONS,
        ENCLOSED_ALPHANUMERICS,
        ENCLOSED_ALPHANUMERIC_SUPPLEMENT,
        ENCLOSED_CJK_LETTERS_AND_MONTHS,
        ENCLOSED_IDEOGRAPHIC_SUPPLEMENT,
        ETHIOPIC,
        ETHIOPIC_EXTENDED,
        ETHIOPIC_EXTENDED_A,
        ETHIOPIC_SUPPLEMENT,
        GENERAL_PUNCTUATION,
        GEOMETRIC_SHAPES,
        GEORGIAN,
        GEORGIAN_SUPPLEMENT,
        GLAGOLITIC,
        GOTHIC,
        GREEK,
        GREEK_EXTENDED,
        GUJARATI,
        GURMUKHI,
        HALFWIDTH_AND_FULLWIDTH_FORMS,
        HANGUL_COMPATIBILITY_JAMO,
        HANGUL_JAMO,
        HANGUL_JAMO_EXTENDED_A,
        HANGUL_JAMO_EXTENDED_B,
        HANGUL_SYLLABLES,
        HANUNOO,
        HEBREW,
        HIGH_PRIVATE_USE_SURROGATES,
        HIGH_SURROGATES,
        HIRAGANA,
        IDEOGRAPHIC_DESCRIPTION_CHARACTERS,
        IMPERIAL_ARAMAIC,
        INSCRIPTIONAL_PAHLAVI,
        INSCRIPTIONAL_PARTHIAN,
        IPA_EXTENSIONS,
        JAVANESE,
        KAITHI,
        KANA_SUPPLEMENT,
        KANBUN,
        KANGXI_RADICALS,
        KANNADA,
        KATAKANA,
        KATAKANA_PHONETIC_EXTENSIONS,
        KAYAH_LI,
        KHAROSHTHI,
        KHMER,
        KHMER_SYMBOLS,
        LAO,
        LATIN_1_SUPPLEMENT,
        LATIN_EXTENDED_A,
        LATIN_EXTENDED_ADDITIONAL,
        LATIN_EXTENDED_B,
        LATIN_EXTENDED_C,
        LATIN_EXTENDED_D,
        LEPCHA,
        LETTERLIKE_SYMBOLS,
        LIMBU,
        LINEAR_B_IDEOGRAMS,
        LINEAR_B_SYLLABARY,
        LISU,
        LOW_SURROGATES,
        LYCIAN,
        LYDIAN,
        MAHJONG_TILES,
        MALAYALAM,
        MANDAIC,
        MATHEMATICAL_ALPHANUMERIC_SYMBOLS,
        MATHEMATICAL_OPERATORS,
        MEETEI_MAYEK,
        MEETEI_MAYEK_EXTENSIONS,
        MEROITIC_CURSIVE,
        MEROITIC_HIEROGLYPHS,
        MIAO,
        MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A,
        MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B,
        MISCELLANEOUS_SYMBOLS,
        MISCELLANEOUS_SYMBOLS_AND_ARROWS,
        MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS,
        MISCELLANEOUS_TECHNICAL,
        MODIFIER_TONE_LETTERS,
        MONGOLIAN,
        MUSICAL_SYMBOLS,
        MYANMAR,
        MYANMAR_EXTENDED_A,
        NEW_TAI_LUE,
        NKO,
        NUMBER_FORMS,
        OGHAM,
        OLD_ITALIC,
        OLD_PERSIAN,
        OLD_SOUTH_ARABIAN,
        OLD_TURKIC,
        OL_CHIKI,
        OPTICAL_CHARACTER_RECOGNITION,
        ORIYA,
        OSMANYA,
        PHAGS_PA,
        PHAISTOS_DISC,
        PHOENICIAN,
        PHONETIC_EXTENSIONS,
        PHONETIC_EXTENSIONS_SUPPLEMENT,
        PLAYING_CARDS,
        PRIVATE_USE_AREA,
        REJANG,
        RUMI_NUMERAL_SYMBOLS,
        RUNIC,
        SAMARITAN,
        SAURASHTRA,
        SHARADA,
        SHAVIAN,
        SINHALA,
        SMALL_FORM_VARIANTS,
        SORA_SOMPENG,
        SPACING_MODIFIER_LETTERS,
        SPECIALS,
        SUNDANESE,
        SUNDANESE_SUPPLEMENT,
        SUPERSCRIPTS_AND_SUBSCRIPTS,
        SUPPLEMENTAL_ARROWS_A,
        SUPPLEMENTAL_ARROWS_B,
        SUPPLEMENTAL_MATHEMATICAL_OPERATORS,
        SUPPLEMENTAL_PUNCTUATION,
        SUPPLEMENTARY_PRIVATE_USE_AREA_A,
        SUPPLEMENTARY_PRIVATE_USE_AREA_B,
        SURROGATES_AREA,
        SYLOTI_NAGRI,
        SYRIAC,
        TAGALOG,
        TAGBANWA,
        TAGS,
        TAI_LE,
        TAI_THAM,
        TAI_VIET,
        TAI_XUAN_JING_SYMBOLS,
        TAKRI,
        TAMIL,
        TELUGU,
        THAANA,
        THAI,
        TIBETAN,
        TIFINAGH,
        TRANSPORT_AND_MAP_SYMBOLS,
        UGARITIC,
        UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS,
        UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED,
        VAI,
        VARIATION_SELECTORS,
        VARIATION_SELECTORS_SUPPLEMENT,
        VEDIC_EXTENSIONS,
        VERTICAL_FORMS,
        YIJING_HEXAGRAM_SYMBOLS,
        YI_RADICALS,
        YI_SYLLABLES,

        /**
         * And these are the settings we use currently within core and are not defined by the
         * Unicode standard
         */
        LATIN,
        CJK,
        ARROW_SYMBOLS,
        HANGUL,
        OPERATING_SYSTEM_CONTROL_CHARACTERS,
        ARABIC_PRESENTATION_FORMS
    }

    /**
     * Get the number of CodeBlocks that this Classification covers
     *
     * @return the number of classifications
     */
    int getClassificationCount();

    /**
     * Return the set of characters that didn't match a classification
     *
     * @return the set of characters that were unclassified
     */
    Iterable<Character> getUnclassifiedCharacters();

    /**
     * Did this classification have this CodeBlock?
     *
     * @param classification
     *            the codeblock in question
     * @return true if we have it, false otherwise
     */
    boolean has(CodeBlock classification);
}
