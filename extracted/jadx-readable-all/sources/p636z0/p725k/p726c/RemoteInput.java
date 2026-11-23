package p636z0.p725k.p726c;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: z0.k.c.v, reason: use source file name */
/* JADX INFO: compiled from: RemoteInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteInput {

    /* JADX INFO: renamed from: a */
    public final String f37801a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f37802b;

    /* JADX INFO: renamed from: c */
    public final CharSequence[] f37803c;

    /* JADX INFO: renamed from: d */
    public final boolean f37804d;

    /* JADX INFO: renamed from: e */
    public final int f37805e;

    /* JADX INFO: renamed from: f */
    public final Bundle f37806f;

    /* JADX INFO: renamed from: g */
    public final Set<String> f37807g;

    /* JADX INFO: renamed from: z0.k.c.v$a */
    /* JADX INFO: compiled from: RemoteInput.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f37808a;

        /* JADX INFO: renamed from: d */
        public CharSequence f37811d;

        /* JADX INFO: renamed from: e */
        public CharSequence[] f37812e;

        /* JADX INFO: renamed from: b */
        public final Set<String> f37809b = new HashSet();

        /* JADX INFO: renamed from: c */
        public final Bundle f37810c = new Bundle();

        /* JADX INFO: renamed from: f */
        public boolean f37813f = true;

        /* JADX INFO: renamed from: g */
        public int f37814g = 0;

        public a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f37808a = str;
        }
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f37801a = str;
        this.f37802b = charSequence;
        this.f37803c = charSequenceArr;
        this.f37804d = z;
        this.f37805e = i;
        this.f37806f = bundle;
        this.f37807g = set;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
}
