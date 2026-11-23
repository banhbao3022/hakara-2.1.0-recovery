package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class si1 {

    /* JADX INFO: renamed from: a */
    public final Pattern f19568a;

    public si1() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14434r4));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f19568a = patternCompile;
    }

    /* JADX INFO: renamed from: a */
    public final String m8353a(String str) {
        Pattern pattern = this.f19568a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
