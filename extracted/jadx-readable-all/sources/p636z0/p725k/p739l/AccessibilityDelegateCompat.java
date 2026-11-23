package p636z0.p725k.p739l;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeProviderCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityViewCommand;

/* JADX INFO: renamed from: z0.k.l.a, reason: use source file name */
/* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a */
    public static final View.AccessibilityDelegate f37976a = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: b */
    public final View.AccessibilityDelegate f37977b;

    /* JADX INFO: renamed from: c */
    public final View.AccessibilityDelegate f37978c;

    /* JADX INFO: renamed from: z0.k.l.a$a */
    /* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
    public static final class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        public final AccessibilityDelegateCompat f37979a;

        public a(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            this.f37979a = accessibilityDelegateCompat;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f37979a.mo16218a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat accessibilityNodeProviderCompatMo16219b = this.f37979a.mo16219b(view);
            if (accessibilityNodeProviderCompatMo16219b != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProviderCompatMo16219b.f38035a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f37979a.mo381c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int iKeyAt;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            Boolean boolM16332c = new ViewCompat2(R.id.tag_screen_reader_focusable, Boolean.class, 28).m16332c(view);
            boolean zBooleanValue = boolM16332c == null ? false : boolM16332c.booleanValue();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(zBooleanValue);
            } else {
                accessibilityNodeInfoCompat.m16271o(1, zBooleanValue);
            }
            Boolean boolM16332c2 = new ViewCompat5(R.id.tag_accessibility_heading, Boolean.class, 28).m16332c(view);
            boolean zBooleanValue2 = boolM16332c2 == null ? false : boolM16332c2.booleanValue();
            if (i >= 28) {
                accessibilityNodeInfo.setHeading(zBooleanValue2);
            } else {
                accessibilityNodeInfoCompat.m16271o(2, zBooleanValue2);
            }
            CharSequence charSequenceM16315i = ViewCompat.m16315i(view);
            if (i >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequenceM16315i);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM16315i);
            }
            CharSequence charSequenceM16332c = new ViewCompat4(R.id.tag_state_description, CharSequence.class, 64, 30).m16332c(view);
            if (i >= 30) {
                accessibilityNodeInfo.setStateDescription(charSequenceM16332c);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequenceM16332c);
            }
            this.f37979a.mo382d(view, accessibilityNodeInfoCompat);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        if (((WeakReference) sparseArray.valueAt(i2)).get() == null) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        sparseArray.remove(((Integer) arrayList.get(i3)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArrM16258f = AccessibilityNodeInfoCompat.m16258f(text);
                if (clickableSpanArrM16258f != null && clickableSpanArrM16258f.length > 0) {
                    accessibilityNodeInfoCompat.m16265h().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i4 = 0; i4 < clickableSpanArrM16258f.length; i4++) {
                        ClickableSpan clickableSpan = clickableSpanArrM16258f[i4];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= sparseArray2.size()) {
                                iKeyAt = AccessibilityNodeInfoCompat.f38017a;
                                AccessibilityNodeInfoCompat.f38017a = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i5)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i5);
                                    break;
                                }
                                i5++;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArrM16258f[i4]));
                        ClickableSpan clickableSpan2 = clickableSpanArrM16258f[i4];
                        Spanned spanned = (Spanned) text;
                        accessibilityNodeInfoCompat.m16261b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        accessibilityNodeInfoCompat.m16261b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        accessibilityNodeInfoCompat.m16261b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        accessibilityNodeInfoCompat.m16261b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    }
                }
            }
            List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            for (int i6 = 0; i6 < listEmptyList.size(); i6++) {
                accessibilityNodeInfoCompat.m16260a((AccessibilityNodeInfoCompat.a) listEmptyList.get(i6));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f37979a.mo11056e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f37979a.mo16220f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f37979a.mo383g(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f37979a.mo16221h(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f37979a.mo16222i(view, accessibilityEvent);
        }
    }

    public AccessibilityDelegateCompat() {
        this(f37976a);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo16218a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f37977b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public AccessibilityNodeProviderCompat mo16219b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f37977b.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo381c(View view, AccessibilityEvent accessibilityEvent) {
        this.f37977b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
    }

    /* JADX INFO: renamed from: e */
    public void mo11056e(View view, AccessibilityEvent accessibilityEvent) {
        this.f37977b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo16220f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f37977b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo383g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        boolean z;
        AccessibilityViewCommand.a aVarNewInstance;
        Exception e;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < listEmptyList.size()) {
                AccessibilityNodeInfoCompat.a aVar = (AccessibilityNodeInfoCompat.a) listEmptyList.get(i2);
                if (aVar.m16275a() != i) {
                    i2++;
                } else if (aVar.f38032l != null) {
                    AccessibilityViewCommand.a aVar2 = null;
                    Class<? extends AccessibilityViewCommand.a> cls = aVar.f38031k;
                    if (cls != null) {
                        try {
                            aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            try {
                                Objects.requireNonNull(aVarNewInstance);
                            } catch (Exception e2) {
                                e = e2;
                                Class<? extends AccessibilityViewCommand.a> cls2 = aVar.f38031k;
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                            }
                        } catch (Exception e3) {
                            aVarNewInstance = null;
                            e = e3;
                        }
                        aVar2 = aVarNewInstance;
                    }
                    zPerformAccessibilityAction = aVar.f38032l.mo935a(view, aVar2);
                    break;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f37977b.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan == null) {
                z = false;
                break;
            }
            ClickableSpan[] clickableSpanArrM16258f = AccessibilityNodeInfoCompat.m16258f(view.createAccessibilityNodeInfo().getText());
            int i4 = 0;
            while (true) {
                if (clickableSpanArrM16258f == null || i4 >= clickableSpanArrM16258f.length) {
                    z = false;
                    break;
                }
                if (clickableSpan.equals(clickableSpanArrM16258f[i4])) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (z) {
                clickableSpan.onClick(view);
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: h */
    public void mo16221h(View view, int i) {
        this.f37977b.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: i */
    public void mo16222i(View view, AccessibilityEvent accessibilityEvent) {
        this.f37977b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public AccessibilityDelegateCompat(View.AccessibilityDelegate accessibilityDelegate) {
        this.f37977b = accessibilityDelegate;
        this.f37978c = new a(this);
    }
}
