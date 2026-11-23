package p007c.p114h.p147g.p148a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: c.h.g.a.b, reason: use source file name */
/* JADX INFO: compiled from: DialogBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class DialogBuilder {

    /* JADX INFO: renamed from: b */
    public final Context f4389b;

    /* JADX INFO: renamed from: c */
    public final int f4390c;

    /* JADX INFO: renamed from: a */
    @SuppressLint({"UseSparseArrays"})
    public HashMap<Integer, a> f4388a = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public boolean f4391d = true;

    /* JADX INFO: renamed from: e */
    public boolean f4392e = true;

    /* JADX INFO: renamed from: c.h.g.a.b$a */
    /* JADX INFO: compiled from: DialogBuilder.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f4393a = null;

        /* JADX INFO: renamed from: b */
        public boolean f4394b = false;

        /* JADX INFO: renamed from: c */
        public View.OnClickListener f4395c = null;

        public a(int i) {
        }
    }

    public DialogBuilder(Context context, int i) {
        this.f4389b = context;
        this.f4390c = i;
    }

    /* JADX INFO: renamed from: a */
    public final a m2214a(int i) {
        a aVar = this.f4388a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(i);
        this.f4388a.put(Integer.valueOf(i), aVar2);
        return aVar2;
    }

    /* JADX INFO: renamed from: b */
    public DialogBuilder m2215b(int i, String str) {
        m2214a(i).f4393a = str;
        return this;
    }
}
