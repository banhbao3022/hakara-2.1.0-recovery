package p007c.p190n.p194b.p209b.p210a2.p211j0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.o, reason: use source file name */
/* JADX INFO: compiled from: ContentMetadataMutations.java */
/* JADX INFO: loaded from: classes.dex */
public class ContentMetadataMutations {

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f6105a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final List<String> f6106b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static ContentMetadataMutations m2983a(ContentMetadataMutations contentMetadataMutations, long j2) {
        Long lValueOf = Long.valueOf(j2);
        Map<String, Object> map = contentMetadataMutations.f6105a;
        Objects.requireNonNull(lValueOf);
        map.put("exo_len", lValueOf);
        contentMetadataMutations.f6106b.remove("exo_len");
        return contentMetadataMutations;
    }
}
