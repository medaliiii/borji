package com.example.borji;

public class HoroscopeDD {
    public static HoroscopeD getZodiacSign(int month, int day) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return new HoroscopeD("Bélier", "Aries", R.drawable.hamel, "Signe de feu, le Bélier est énergique et courageux.");
        }
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return new HoroscopeD("Taureau", "Taurus", R.drawable.thawer, "Patient et déterminé, le Taureau aime le confort.");
        }
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return new HoroscopeD("Gémeaux", "Gemini", R.drawable.jawza, "Curieux et communicatif, les Gémeaux adorent apprendre.");
        }
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return new HoroscopeD("Cancer", "Cancer", R.drawable.cancer, "Sensible et loyal, le Cancer est proche de ses émotions.");
        }
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return new HoroscopeD("Lion", "Leo", R.drawable.leo, "Charismatique et ambitieux, le Lion adore briller.");
        }
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return new HoroscopeD("Vierge", "Virgo", R.drawable.virgo, "Pragmatique et méthodique, la Vierge cherche la perfection.");
        }
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return new HoroscopeD("Balance", "Libra", R.drawable.libra, "Diplomate et équilibrée, la Balance valorise l'harmonie.");
        }
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return new HoroscopeD("Scorpion", "Scorpio", R.drawable.scorpio, "Intense et passionné, le Scorpion est mystérieux et loyal.");
        }
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return new HoroscopeD("Sagittaire", "Sagittarius", R.drawable.sag, "Optimiste et aventureux, le Sagittaire adore explorer.");
        }
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return new HoroscopeD("Capricorne", "Capricorn", R.drawable.capricorn, "Ambitieux et discipliné, le Capricorne vise le succès.");
        }
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return new HoroscopeD("Verseau", "Aquarius", R.drawable.stal, "Innovant et indépendant, le Verseau est un visionnaire.");
        }
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return new HoroscopeD("Poissons", "Pisces", R.drawable.pisces, "Empathique et créatif, les Poissons ont une riche imagination.");
        }

        // Ce point ne sera jamais atteint si la date est toujours valide.
        throw new IllegalArgumentException("Date invalide : mois ou jour hors limites.");
    }
}
