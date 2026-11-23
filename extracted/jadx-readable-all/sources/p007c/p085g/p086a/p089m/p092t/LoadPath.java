package p007c.p085g.p086a.p089m.p092t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p090s.DataRewinder;
import p636z0.p725k.p738k.Pools2;

/* JADX INFO: renamed from: c.g.a.m.t.u, reason: use source file name */
/* JADX INFO: compiled from: LoadPath.java */
/* JADX INFO: loaded from: classes.dex */
public class LoadPath<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    public final Pools2<List<Throwable>> f3362a;

    /* JADX INFO: renamed from: b */
    public final List<? extends DecodePath<Data, ResourceType, Transcode>> f3363b;

    /* JADX INFO: renamed from: c */
    public final String f3364c;

    public LoadPath(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<DecodePath<Data, ResourceType, Transcode>> list, Pools2<List<Throwable>> pools2) {
        this.f3362a = pools2;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f3363b = list;
        StringBuilder sbM1556G = outline.m1556G("Failed LoadPath{");
        sbM1556G.append(cls.getSimpleName());
        sbM1556G.append("->");
        sbM1556G.append(cls2.getSimpleName());
        sbM1556G.append("->");
        sbM1556G.append(cls3.getSimpleName());
        sbM1556G.append("}");
        this.f3364c = sbM1556G.toString();
    }

    /* JADX INFO: renamed from: a */
    public Resource2<Transcode> m1842a(DataRewinder<Data> dataRewinder, Options options, int i, int i2, DecodePath.a<ResourceType> aVar) throws GlideException {
        List<Throwable> listMo2057a = this.f3362a.mo2057a();
        Objects.requireNonNull(listMo2057a, "Argument must not be null");
        List<Throwable> list = listMo2057a;
        try {
            int size = this.f3363b.size();
            Resource2<Transcode> resource2M1807a = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    resource2M1807a = this.f3363b.get(i3).m1807a(dataRewinder, i, i2, options, aVar);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (resource2M1807a != null) {
                    break;
                }
            }
            if (resource2M1807a == null) {
                throw new GlideException(this.f3364c, new ArrayList(list));
            }
            this.f3362a.mo2058b(list);
            return resource2M1807a;
        } catch (Throwable th) {
            this.f3362a.mo2058b(list);
            throw th;
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("LoadPath{decodePaths=");
        sbM1556G.append(Arrays.toString(this.f3363b.toArray()));
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
