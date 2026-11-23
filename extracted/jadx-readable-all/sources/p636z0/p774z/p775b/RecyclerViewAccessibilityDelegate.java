package p636z0.p774z.p775b;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeProviderCompat;

/* JADX INFO: renamed from: z0.z.b.c0, reason: use source file name */
/* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f39144d;

    /* JADX INFO: renamed from: e */
    public final a f39145e;

    /* JADX INFO: renamed from: z0.z.b.c0$a */
    /* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: d */
        public final RecyclerViewAccessibilityDelegate f39146d;

        /* JADX INFO: renamed from: e */
        public Map<View, AccessibilityDelegateCompat> f39147e = new WeakHashMap();

        public a(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.f39146d = recyclerViewAccessibilityDelegate;
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: a */
        public boolean mo16218a(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f39147e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.mo16218a(view, accessibilityEvent) : this.f37977b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: b */
        public AccessibilityNodeProviderCompat mo16219b(View view) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f39147e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.mo16219b(view) : super.mo16219b(view);
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: c */
        public void mo381c(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f39147e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo381c(view, accessibilityEvent);
            } else {
                this.f37977b.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f39146d.m16986j() || this.f39146d.f39144d.getLayoutManager() == null) {
                this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
                return;
            }
            this.f39146d.f39144d.getLayoutManager().m756m0(view, accessibilityNodeInfoCompat);
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f39147e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo382d(view, accessibilityNodeInfoCompat);
            } else {
                this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            }
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: e */
        public void mo11056e(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f39147e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo11056e(view, accessibilityEvent);
            } else {
                this.f37977b.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: f */
        public boolean mo16220f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f39147e.get(viewGroup);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.mo16220f(viewGroup, view, accessibilityEvent) : this.f37977b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: g */
        public boolean mo383g(View view, int i, Bundle bundle) {
            if (this.f39146d.m16986j() || this.f39146d.f39144d.getLayoutManager() == null) {
                return super.mo383g(view, i, bundle);
            }
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f39147e.get(view);
            if (accessibilityDelegateCompat != null) {
                if (accessibilityDelegateCompat.mo383g(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo383g(view, i, bundle)) {
                return true;
            }
            RecyclerView.AbstractC0160m layoutManager = this.f39146d.f39144d.getLayoutManager();
            RecyclerView.C0167t c0167t = layoutManager.f1036b.f965m;
            return layoutManager.m713E0();
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: h */
        public void mo16221h(View view, int i) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f39147e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo16221h(view, i);
            } else {
                this.f37977b.sendAccessibilityEvent(view, i);
            }
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: i */
        public void mo16222i(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = this.f39147e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.mo16222i(view, accessibilityEvent);
            } else {
                this.f37977b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.f39144d = recyclerView;
        a aVar = this.f39145e;
        if (aVar != null) {
            this.f39145e = aVar;
        } else {
            this.f39145e = new a(this);
        }
    }

    @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
    /* JADX INFO: renamed from: c */
    public void mo381c(View view, AccessibilityEvent accessibilityEvent) {
        this.f37977b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m16986j()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo541j0(accessibilityEvent);
        }
    }

    @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
    /* JADX INFO: renamed from: d */
    public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
        if (m16986j() || this.f39144d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.AbstractC0160m layoutManager = this.f39144d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f1036b;
        layoutManager.mo755l0(recyclerView.f965m, recyclerView.f980t0, accessibilityNodeInfoCompat);
    }

    @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
    /* JADX INFO: renamed from: g */
    public boolean mo383g(View view, int i, Bundle bundle) {
        if (super.mo383g(view, i, bundle)) {
            return true;
        }
        if (m16986j() || this.f39144d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.AbstractC0160m layoutManager = this.f39144d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f1036b;
        return layoutManager.mo711D0(recyclerView.f965m, recyclerView.f980t0, i, bundle);
    }

    /* JADX INFO: renamed from: j */
    public boolean m16986j() {
        return this.f39144d.m584M();
    }
}
