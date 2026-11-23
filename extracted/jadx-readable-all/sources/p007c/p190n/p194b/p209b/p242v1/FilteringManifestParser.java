package p007c.p190n.p194b.p209b.p242v1;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
import p007c.p190n.p194b.p209b.p242v1.FilterableManifest;

/* JADX INFO: renamed from: c.n.b.b.v1.b, reason: use source file name */
/* JADX INFO: compiled from: FilteringManifestParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class FilteringManifestParser<T extends FilterableManifest<T>> implements ParsingLoadable.a<T> {

    /* JADX INFO: renamed from: a */
    public final ParsingLoadable.a<? extends T> f8817a;

    /* JADX INFO: renamed from: b */
    public final List<StreamKey> f8818b;

    public FilteringManifestParser(ParsingLoadable.a<? extends T> aVar, List<StreamKey> list) {
        this.f8817a = aVar;
        this.f8818b = list;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.ParsingLoadable.a
    /* JADX INFO: renamed from: a */
    public Object mo2912a(Uri uri, InputStream inputStream) throws IOException {
        T tMo2912a = this.f8817a.mo2912a(uri, inputStream);
        List<StreamKey> list = this.f8818b;
        return (list == null || list.isEmpty()) ? tMo2912a : (FilterableManifest) tMo2912a.mo4049a(this.f8818b);
    }
}
