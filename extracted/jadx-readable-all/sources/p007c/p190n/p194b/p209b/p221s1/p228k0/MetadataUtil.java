package p007c.p190n.p194b.p209b.p221s1.p228k0;

import android.util.Log;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p234u1.p239m.ApicFrame;
import p007c.p190n.p194b.p209b.p234u1.p239m.CommentFrame;
import p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame;
import p007c.p190n.p194b.p209b.p234u1.p239m.TextInformationFrame;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.h, reason: use source file name */
/* JADX INFO: compiled from: MetadataUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class MetadataUtil {

    /* JADX INFO: renamed from: a */
    public static final String[] f7937a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX INFO: renamed from: a */
    public static CommentFrame m3831a(int i, ParsableByteArray parsableByteArray) {
        int iM3201f = parsableByteArray.m3201f();
        if (parsableByteArray.m3201f() == 1684108385) {
            parsableByteArray.m3195E(8);
            String strM3210o = parsableByteArray.m3210o(iM3201f - 16);
            return new CommentFrame("und", strM3210o, strM3210o);
        }
        StringBuilder sbM1556G = outline.m1556G("Failed to parse comment attribute: ");
        sbM1556G.append(Atom.m3808a(i));
        Log.w("MetadataUtil", sbM1556G.toString());
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ApicFrame m3832b(ParsableByteArray parsableByteArray) {
        String str;
        int iM3201f = parsableByteArray.m3201f();
        if (parsableByteArray.m3201f() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM3201f2 = parsableByteArray.m3201f() & 16777215;
        if (iM3201f2 == 13) {
            str = "image/jpeg";
        } else {
            str = iM3201f2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            outline.m1565P("Unrecognized cover art flags: ", iM3201f2, "MetadataUtil");
            return null;
        }
        parsableByteArray.m3195E(4);
        int i = iM3201f - 16;
        byte[] bArr = new byte[i];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, i);
        parsableByteArray.f6393b += i;
        return new ApicFrame(str, null, 3, bArr);
    }

    /* JADX INFO: renamed from: c */
    public static TextInformationFrame m3833c(int i, String str, ParsableByteArray parsableByteArray) {
        int iM3201f = parsableByteArray.m3201f();
        if (parsableByteArray.m3201f() == 1684108385 && iM3201f >= 22) {
            parsableByteArray.m3195E(10);
            int iM3219x = parsableByteArray.m3219x();
            if (iM3219x > 0) {
                String strM1590l = outline.m1590l("", iM3219x);
                int iM3219x2 = parsableByteArray.m3219x();
                if (iM3219x2 > 0) {
                    strM1590l = strM1590l + "/" + iM3219x2;
                }
                return new TextInformationFrame(str, null, strM1590l);
            }
        }
        StringBuilder sbM1556G = outline.m1556G("Failed to parse index/count attribute: ");
        sbM1556G.append(Atom.m3808a(i));
        Log.w("MetadataUtil", sbM1556G.toString());
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static TextInformationFrame m3834d(int i, String str, ParsableByteArray parsableByteArray) {
        int iM3201f = parsableByteArray.m3201f();
        if (parsableByteArray.m3201f() == 1684108385) {
            parsableByteArray.m3195E(8);
            return new TextInformationFrame(str, null, parsableByteArray.m3210o(iM3201f - 16));
        }
        StringBuilder sbM1556G = outline.m1556G("Failed to parse text attribute: ");
        sbM1556G.append(Atom.m3808a(i));
        Log.w("MetadataUtil", sbM1556G.toString());
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Id3Frame m3835e(int i, String str, ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        int iM3836f = m3836f(parsableByteArray);
        if (z2) {
            iM3836f = Math.min(1, iM3836f);
        }
        if (iM3836f >= 0) {
            return z ? new TextInformationFrame(str, null, Integer.toString(iM3836f)) : new CommentFrame("und", str, Integer.toString(iM3836f));
        }
        StringBuilder sbM1556G = outline.m1556G("Failed to parse uint8 attribute: ");
        sbM1556G.append(Atom.m3808a(i));
        Log.w("MetadataUtil", sbM1556G.toString());
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static int m3836f(ParsableByteArray parsableByteArray) {
        parsableByteArray.m3195E(4);
        if (parsableByteArray.m3201f() == 1684108385) {
            parsableByteArray.m3195E(8);
            return parsableByteArray.m3214s();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
