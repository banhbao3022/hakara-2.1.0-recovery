package p636z0.p759s;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p654b0.SavedStateRegistry;

/* JADX INFO: renamed from: z0.s.z, reason: use source file name */
/* JADX INFO: compiled from: SavedStateHandle.java */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandle {

    /* JADX INFO: renamed from: a */
    public static final Class[] f38730a = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: b */
    public final Map<String, Object> f38731b;

    /* JADX INFO: renamed from: c */
    public final Map<String, SavedStateRegistry.b> f38732c;

    /* JADX INFO: renamed from: d */
    public final Map<String, ?> f38733d;

    /* JADX INFO: renamed from: e */
    public final SavedStateRegistry.b f38734e;

    /* JADX INFO: renamed from: z0.s.z$a */
    /* JADX INFO: compiled from: SavedStateHandle.java */
    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // p636z0.p654b0.SavedStateRegistry.b
        /* JADX INFO: renamed from: a */
        public Bundle mo867a() {
            for (Map.Entry entry : new HashMap(SavedStateHandle.this.f38732c).entrySet()) {
                Bundle bundleMo867a = ((SavedStateRegistry.b) entry.getValue()).mo867a();
                SavedStateHandle savedStateHandle = SavedStateHandle.this;
                String str = (String) entry.getKey();
                Objects.requireNonNull(savedStateHandle);
                if (bundleMo867a != null) {
                    Class[] clsArr = SavedStateHandle.f38730a;
                    int length = clsArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            StringBuilder sbM1556G = outline.m1556G("Can't put value with type ");
                            sbM1556G.append(bundleMo867a.getClass());
                            sbM1556G.append(" into saved state");
                            throw new IllegalArgumentException(sbM1556G.toString());
                        }
                        if (clsArr[i].isInstance(bundleMo867a)) {
                            break;
                        }
                        i++;
                    }
                }
                MutableLiveData mutableLiveData = (MutableLiveData) savedStateHandle.f38733d.get(str);
                if (mutableLiveData != null) {
                    mutableLiveData.mo427j(bundleMo867a);
                } else {
                    savedStateHandle.f38731b.put(str, bundleMo867a);
                }
            }
            Set<String> setKeySet = SavedStateHandle.this.f38731b.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(setKeySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str2 : setKeySet) {
                arrayList.add(str2);
                arrayList2.add(SavedStateHandle.this.f38731b.get(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    public SavedStateHandle(Map<String, Object> map) {
        this.f38732c = new HashMap();
        this.f38733d = new HashMap();
        this.f38734e = new a();
        this.f38731b = new HashMap(map);
    }

    public SavedStateHandle() {
        this.f38732c = new HashMap();
        this.f38733d = new HashMap();
        this.f38734e = new a();
        this.f38731b = new HashMap();
    }
}
