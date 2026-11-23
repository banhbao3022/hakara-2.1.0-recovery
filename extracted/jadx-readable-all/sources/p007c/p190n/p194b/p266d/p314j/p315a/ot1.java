package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ot1 implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final Pattern f17732a;

    public ot1(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f17732a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(@NullableDecl File file, String str) {
        return this.f17732a.matcher(str).matches();
    }
}
