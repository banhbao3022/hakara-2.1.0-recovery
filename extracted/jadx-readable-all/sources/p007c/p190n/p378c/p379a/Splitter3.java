package p007c.p190n.p378c.p379a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.c.a.h, reason: use source file name */
/* JADX INFO: compiled from: Splitter.java */
/* JADX INFO: loaded from: classes.dex */
public final class Splitter3 {

    /* JADX INFO: renamed from: a */
    public final CharMatcher f26136a;

    /* JADX INFO: renamed from: b */
    public final b f26137b;

    /* JADX INFO: renamed from: c */
    public final int f26138c;

    /* JADX INFO: renamed from: c.n.c.a.h$a */
    /* JADX INFO: compiled from: Splitter.java */
    public static abstract class a extends AbstractIterator<String> {

        /* JADX INFO: renamed from: h */
        public final CharSequence f26139h;

        /* JADX INFO: renamed from: i */
        public final CharMatcher f26140i;

        /* JADX INFO: renamed from: l */
        public int f26143l;

        /* JADX INFO: renamed from: k */
        public int f26142k = 0;

        /* JADX INFO: renamed from: j */
        public final boolean f26141j = false;

        public a(Splitter3 splitter3, CharSequence charSequence) {
            this.f26140i = splitter3.f26136a;
            this.f26143l = splitter3.f26138c;
            this.f26139h = charSequence;
        }
    }

    /* JADX INFO: renamed from: c.n.c.a.h$b */
    /* JADX INFO: compiled from: Splitter.java */
    public interface b {
    }

    public Splitter3(b bVar) {
        CharMatcher.d dVar = CharMatcher.d.f26128b;
        this.f26137b = bVar;
        this.f26136a = dVar;
        this.f26138c = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public List<String> m11579a(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Splitter2 splitter2 = (Splitter2) this.f26137b;
        Objects.requireNonNull(splitter2);
        Splitter splitter = new Splitter(splitter2, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (splitter.hasNext()) {
            arrayList.add(splitter.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
