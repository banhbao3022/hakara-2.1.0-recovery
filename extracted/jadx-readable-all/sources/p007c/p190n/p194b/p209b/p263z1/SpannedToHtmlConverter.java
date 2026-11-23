package p007c.p190n.p194b.p209b.p263z1;

import android.text.Html;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: c.n.b.b.z1.g, reason: use source file name */
/* JADX INFO: compiled from: SpannedToHtmlConverter.java */
/* JADX INFO: loaded from: classes.dex */
public final class SpannedToHtmlConverter {

    /* JADX INFO: renamed from: a */
    public static final Pattern f10388a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: c.n.b.b.z1.g$b */
    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f10389a;

        /* JADX INFO: renamed from: b */
        public final Map<String, String> f10390b;

        public b(String str, Map map, a aVar) {
            this.f10389a = str;
            this.f10390b = map;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.z1.g$c */
    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f10391a;

        /* JADX INFO: renamed from: b */
        public final int f10392b;

        /* JADX INFO: renamed from: c */
        public final String f10393c;

        /* JADX INFO: renamed from: d */
        public final String f10394d;

        public c(int i, int i2, String str, String str2, a aVar) {
            this.f10391a = i;
            this.f10392b = i2;
            this.f10393c = str;
            this.f10394d = str2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.z1.g$d */
    /* JADX INFO: compiled from: SpannedToHtmlConverter.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final List<c> f10395a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<c> f10396b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static String m4591a(CharSequence charSequence) {
        return f10388a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
