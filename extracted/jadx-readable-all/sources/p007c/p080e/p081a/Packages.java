package p007c.p080e.p081a;

import com.arthenica.mobileffmpeg.AbiDetect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c.e.a.f, reason: use source file name */
/* JADX INFO: compiled from: Packages.java */
/* JADX INFO: loaded from: classes.dex */
public class Packages {

    /* JADX INFO: renamed from: a */
    public static final List<String> f2807a;

    static {
        ArrayList arrayList = new ArrayList();
        f2807a = arrayList;
        arrayList.add("fontconfig");
        arrayList.add("freetype");
        arrayList.add("fribidi");
        arrayList.add("gmp");
        arrayList.add("gnutls");
        arrayList.add("kvazaar");
        arrayList.add("mp3lame");
        arrayList.add("libaom");
        arrayList.add("libass");
        arrayList.add("iconv");
        arrayList.add("libilbc");
        arrayList.add("libtheora");
        arrayList.add("libvidstab");
        arrayList.add("libvorbis");
        arrayList.add("libvpx");
        arrayList.add("libwebp");
        arrayList.add("libxml2");
        arrayList.add("opencore-amr");
        arrayList.add("openh264");
        arrayList.add("opus");
        arrayList.add("rubberband");
        arrayList.add("sdl2");
        arrayList.add("shine");
        arrayList.add("snappy");
        arrayList.add("soxr");
        arrayList.add("speex");
        arrayList.add("tesseract");
        arrayList.add("twolame");
        arrayList.add("wavpack");
        arrayList.add("x264");
        arrayList.add("x265");
        arrayList.add("xvid");
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m1609a() {
        String nativeBuildConf = AbiDetect.getNativeBuildConf();
        ArrayList arrayList = new ArrayList();
        for (String str : f2807a) {
            if (!nativeBuildConf.contains("enable-" + str)) {
                if (nativeBuildConf.contains("enable-lib" + str)) {
                }
            }
            arrayList.add(str);
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
