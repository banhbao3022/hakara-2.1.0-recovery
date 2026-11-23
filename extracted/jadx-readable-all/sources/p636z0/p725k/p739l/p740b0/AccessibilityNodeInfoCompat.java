package p636z0.p725k.p739l.p740b0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: z0.k.l.b0.b, reason: use source file name */
/* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {

    /* JADX INFO: renamed from: a */
    public static int f38017a;

    /* JADX INFO: renamed from: b */
    public final AccessibilityNodeInfo f38018b;

    /* JADX INFO: renamed from: c */
    public int f38019c = -1;

    /* JADX INFO: renamed from: d */
    public int f38020d = -1;

    /* JADX INFO: renamed from: z0.k.l.b0.b$a */
    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final a f38021a;

        /* JADX INFO: renamed from: b */
        public static final a f38022b;

        /* JADX INFO: renamed from: c */
        public static final a f38023c;

        /* JADX INFO: renamed from: d */
        public static final a f38024d;

        /* JADX INFO: renamed from: e */
        public static final a f38025e;

        /* JADX INFO: renamed from: f */
        public static final a f38026f;

        /* JADX INFO: renamed from: g */
        public static final a f38027g;

        /* JADX INFO: renamed from: h */
        public static final a f38028h;

        /* JADX INFO: renamed from: i */
        public final Object f38029i;

        /* JADX INFO: renamed from: j */
        public final int f38030j;

        /* JADX INFO: renamed from: k */
        public final Class<? extends AccessibilityViewCommand.a> f38031k;

        /* JADX INFO: renamed from: l */
        public final AccessibilityViewCommand f38032l;

        static {
            new a(1, null);
            new a(2, null);
            new a(4, null);
            new a(8, null);
            f38021a = new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new AccessibilityNodeInfo.AccessibilityAction(256, null);
            new AccessibilityNodeInfo.AccessibilityAction(512, null);
            new AccessibilityNodeInfo.AccessibilityAction(1024, null);
            new AccessibilityNodeInfo.AccessibilityAction(2048, null);
            f38022b = new a(4096, null);
            f38023c = new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new AccessibilityNodeInfo.AccessibilityAction(131072, null);
            f38024d = new a(262144, null);
            f38025e = new a(524288, null);
            f38026f = new a(1048576, null);
            new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowOnScreen, null);
            }
            if ((i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollToPosition, null);
            }
            f38027g = new a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            if ((i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollLeft, null);
            }
            f38028h = new a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            if ((i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollRight, null);
            }
            if ((i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageUp, null);
            }
            if ((i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageDown, null);
            }
            if ((i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageLeft, null);
            }
            if ((i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageRight, null);
            }
            if ((i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionContextClick, null);
            }
            if ((i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionSetProgress, null);
            }
            if ((i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionMoveWindow, null);
            }
            if ((i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowTooltip, null);
            }
            if ((i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionHideTooltip, null);
            }
            if ((i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPressAndHold, null);
            }
            if ((i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionImeEnter, null);
            }
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* JADX INFO: renamed from: a */
        public int m16275a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f38029i).getId();
        }

        /* JADX INFO: renamed from: b */
        public CharSequence m16276b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f38029i).getLabel();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f38029i;
            if (obj2 == null) {
                return aVar.f38029i == null;
            }
            return obj2.equals(aVar.f38029i);
        }

        public int hashCode() {
            Object obj = this.f38029i;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i, charSequence, accessibilityViewCommand, null);
        }

        public a(Object obj, int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class<? extends AccessibilityViewCommand.a> cls) {
            this.f38030j = i;
            this.f38032l = accessibilityViewCommand;
            if (obj == null) {
                this.f38029i = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f38029i = obj;
            }
            this.f38031k = cls;
        }
    }

    /* JADX INFO: renamed from: z0.k.l.b0.b$b */
    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Object f38033a;

        public b(Object obj) {
            this.f38033a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static b m16277a(int i, int i2, boolean z, int i3) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* JADX INFO: renamed from: z0.k.l.b0.b$c */
    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final Object f38034a;

        public c(Object obj) {
            this.f38034a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static c m16278a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    @Deprecated
    public AccessibilityNodeInfoCompat(Object obj) {
        this.f38018b = (AccessibilityNodeInfo) obj;
    }

    /* JADX INFO: renamed from: d */
    public static String m16257d(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* JADX INFO: renamed from: f */
    public static ClickableSpan[] m16258f(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static AccessibilityNodeInfoCompat m16259n() {
        return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: a */
    public void m16260a(a aVar) {
        this.f38018b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f38029i);
    }

    /* JADX INFO: renamed from: b */
    public final List<Integer> m16261b(String str) {
        ArrayList<Integer> integerArrayList = this.f38018b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f38018b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public List<a> m16262c() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f38018b.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i), 0, null, null, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public int m16263e() {
        return this.f38018b.getChildCount();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f38018b;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.f38018b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.f38018b)) {
            return false;
        }
        return this.f38020d == accessibilityNodeInfoCompat.f38020d && this.f38019c == accessibilityNodeInfoCompat.f38019c;
    }

    /* JADX INFO: renamed from: g */
    public CharSequence m16264g() {
        return this.f38018b.getContentDescription();
    }

    /* JADX INFO: renamed from: h */
    public Bundle m16265h() {
        return this.f38018b.getExtras();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f38018b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m16266i() {
        if (!(!m16261b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f38018b.getText();
        }
        List<Integer> listM16261b = m16261b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listM16261b2 = m16261b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listM16261b3 = m16261b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listM16261b4 = m16261b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f38018b.getText(), 0, this.f38018b.getText().length()));
        for (int i = 0; i < listM16261b.size(); i++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(listM16261b4.get(i).intValue(), this, m16265h().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listM16261b.get(i).intValue(), listM16261b2.get(i).intValue(), listM16261b3.get(i).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: j */
    public boolean m16267j() {
        return this.f38018b.isCheckable();
    }

    /* JADX INFO: renamed from: k */
    public boolean m16268k() {
        return this.f38018b.isFocusable();
    }

    /* JADX INFO: renamed from: l */
    public boolean m16269l() {
        return this.f38018b.isScrollable();
    }

    /* JADX INFO: renamed from: m */
    public boolean m16270m() {
        return this.f38018b.isVisibleToUser();
    }

    /* JADX INFO: renamed from: o */
    public final void m16271o(int i, boolean z) {
        Bundle bundleM16265h = m16265h();
        if (bundleM16265h != null) {
            int i2 = bundleM16265h.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleM16265h.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m16272p(Object obj) {
        this.f38018b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f38033a);
    }

    /* JADX INFO: renamed from: q */
    public void m16273q(Object obj) {
        this.f38018b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f38034a);
    }

    /* JADX INFO: renamed from: r */
    public void m16274r(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f38018b.setHintText(charSequence);
        } else {
            this.f38018b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f38018b.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f38018b.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f38018b.getPackageName());
        sb.append("; className: ");
        sb.append(this.f38018b.getClassName());
        sb.append("; text: ");
        sb.append(m16266i());
        sb.append("; contentDescription: ");
        sb.append(m16264g());
        sb.append("; viewId: ");
        sb.append(this.f38018b.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(m16267j());
        sb.append("; checked: ");
        sb.append(this.f38018b.isChecked());
        sb.append("; focusable: ");
        sb.append(m16268k());
        sb.append("; focused: ");
        sb.append(this.f38018b.isFocused());
        sb.append("; selected: ");
        sb.append(this.f38018b.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f38018b.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f38018b.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f38018b.isEnabled());
        sb.append("; password: ");
        sb.append(this.f38018b.isPassword());
        sb.append("; scrollable: " + m16269l());
        sb.append("; [");
        List<a> listM16262c = m16262c();
        for (int i = 0; i < listM16262c.size(); i++) {
            a aVar = listM16262c.get(i);
            String strM16257d = m16257d(aVar.m16275a());
            if (strM16257d.equals("ACTION_UNKNOWN") && aVar.m16276b() != null) {
                strM16257d = aVar.m16276b().toString();
            }
            sb.append(strM16257d);
            if (i != listM16262c.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f38018b = accessibilityNodeInfo;
    }
}
