package p636z0.p725k.p739l.p740b0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: z0.k.l.b0.c, reason: use source file name */
/* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {

    /* JADX INFO: renamed from: a */
    public final Object f38035a;

    /* JADX INFO: renamed from: z0.k.l.b0.c$a */
    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final AccessibilityNodeProviderCompat f38036a;

        public a(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f38036a = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatMo16279a = this.f38036a.mo16279a(i);
            if (accessibilityNodeInfoCompatMo16279a == null) {
                return null;
            }
            return accessibilityNodeInfoCompatMo16279a.f38018b;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            Objects.requireNonNull(this.f38036a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f38036a.mo16281c(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: z0.k.l.b0.c$b */
    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    public static class b extends a {
        public b(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatMo16280b = this.f38036a.mo16280b(i);
            if (accessibilityNodeInfoCompatMo16280b == null) {
                return null;
            }
            return accessibilityNodeInfoCompatMo16280b.f38018b;
        }
    }

    /* JADX INFO: renamed from: z0.k.l.b0.c$c */
    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    public static class c extends b {
        public c(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f38036a);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f38035a = new c(this);
        } else {
            this.f38035a = new b(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public AccessibilityNodeInfoCompat mo16279a(int i) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public AccessibilityNodeInfoCompat mo16280b(int i) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo16281c(int i, int i2, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.f38035a = obj;
    }
}
