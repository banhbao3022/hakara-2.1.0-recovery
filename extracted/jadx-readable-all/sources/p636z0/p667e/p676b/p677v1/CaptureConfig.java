package p636z0.p667e.p676b.p677v1;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: z0.e.b.v1.g0, reason: use source file name */
/* JADX INFO: compiled from: CaptureConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class CaptureConfig {

    /* JADX INFO: renamed from: a */
    public static final Config3.a<Integer> f36141a = new AutoValue_Config_Option("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* JADX INFO: renamed from: b */
    public static final Config3.a<Integer> f36142b = new AutoValue_Config_Option("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* JADX INFO: renamed from: c */
    public final List<DeferrableSurface> f36143c;

    /* JADX INFO: renamed from: d */
    public final Config3 f36144d;

    /* JADX INFO: renamed from: e */
    public final int f36145e;

    /* JADX INFO: renamed from: f */
    public final List<CameraCaptureCallback> f36146f;

    /* JADX INFO: renamed from: g */
    public final boolean f36147g;

    /* JADX INFO: renamed from: h */
    public final TagBundle f36148h;

    /* JADX INFO: renamed from: z0.e.b.v1.g0$b */
    /* JADX INFO: compiled from: CaptureConfig.java */
    public interface b {
    }

    public CaptureConfig(List<DeferrableSurface> list, Config3 config3, int i, List<CameraCaptureCallback> list2, boolean z, TagBundle tagBundle) {
        this.f36143c = list;
        this.f36144d = config3;
        this.f36145e = i;
        this.f36146f = Collections.unmodifiableList(list2);
        this.f36147g = z;
        this.f36148h = tagBundle;
    }

    /* JADX INFO: renamed from: a */
    public List<DeferrableSurface> m15362a() {
        return Collections.unmodifiableList(this.f36143c);
    }

    /* JADX INFO: renamed from: z0.e.b.v1.g0$a */
    /* JADX INFO: compiled from: CaptureConfig.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Set<DeferrableSurface> f36149a;

        /* JADX INFO: renamed from: b */
        public MutableConfig f36150b;

        /* JADX INFO: renamed from: c */
        public int f36151c;

        /* JADX INFO: renamed from: d */
        public List<CameraCaptureCallback> f36152d;

        /* JADX INFO: renamed from: e */
        public boolean f36153e;

        /* JADX INFO: renamed from: f */
        public MutableTagBundle f36154f;

        public a() {
            this.f36149a = new HashSet();
            this.f36150b = MutableOptionsBundle.m15434y();
            this.f36151c = -1;
            this.f36152d = new ArrayList();
            this.f36153e = false;
            this.f36154f = new MutableTagBundle(new ArrayMap());
        }

        /* JADX INFO: renamed from: a */
        public void m15363a(Collection<CameraCaptureCallback> collection) {
            Iterator<CameraCaptureCallback> it = collection.iterator();
            while (it.hasNext()) {
                m15364b(it.next());
            }
        }

        /* JADX INFO: renamed from: b */
        public void m15364b(CameraCaptureCallback cameraCaptureCallback) {
            if (this.f36152d.contains(cameraCaptureCallback)) {
                throw new IllegalArgumentException("duplicate camera capture callback");
            }
            this.f36152d.add(cameraCaptureCallback);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: c */
        public void m15365c(Config3 config3) {
            for (Config3.a<?> aVar : config3.mo15104c()) {
                Object objMo15105d = ((OptionsBundle) this.f36150b).mo15105d(aVar, null);
                Object objMo15102a = config3.mo15102a(aVar);
                if (objMo15105d instanceof MultiValueSet) {
                    ((MultiValueSet) objMo15105d).f36311a.addAll(((MultiValueSet) objMo15102a).m15433b());
                } else {
                    if (objMo15102a instanceof MultiValueSet) {
                        objMo15102a = ((MultiValueSet) objMo15102a).clone();
                    }
                    ((MutableOptionsBundle) this.f36150b).m15436A(aVar, config3.mo15106e(aVar), objMo15102a);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public CaptureConfig m15366d() {
            ArrayList arrayList = new ArrayList(this.f36149a);
            OptionsBundle optionsBundleM15339x = OptionsBundle.m15339x(this.f36150b);
            int i = this.f36151c;
            List<CameraCaptureCallback> list = this.f36152d;
            boolean z = this.f36153e;
            MutableTagBundle mutableTagBundle = this.f36154f;
            TagBundle tagBundle = TagBundle.f36212a;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : mutableTagBundle.f36213b.keySet()) {
                arrayMap.put(str, mutableTagBundle.m15397a(str));
            }
            return new CaptureConfig(arrayList, optionsBundleM15339x, i, list, z, new TagBundle(arrayMap));
        }

        public a(CaptureConfig captureConfig) {
            HashSet hashSet = new HashSet();
            this.f36149a = hashSet;
            this.f36150b = MutableOptionsBundle.m15434y();
            this.f36151c = -1;
            this.f36152d = new ArrayList();
            this.f36153e = false;
            this.f36154f = new MutableTagBundle(new ArrayMap());
            hashSet.addAll(captureConfig.f36143c);
            this.f36150b = MutableOptionsBundle.m15435z(captureConfig.f36144d);
            this.f36151c = captureConfig.f36145e;
            this.f36152d.addAll(captureConfig.f36146f);
            this.f36153e = captureConfig.f36147g;
            TagBundle tagBundle = captureConfig.f36148h;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : tagBundle.f36213b.keySet()) {
                arrayMap.put(str, tagBundle.m15397a(str));
            }
            this.f36154f = new MutableTagBundle(arrayMap);
        }
    }
}
