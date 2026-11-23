package com.facebook.stetho.inspector.elements.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.stetho.common.android.AccessibilityUtil;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityNodeInfoWrapper {
    public static AccessibilityNodeInfoCompat createNodeInfoFromView(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatM16259n = AccessibilityNodeInfoCompat.m16259n();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompatM16259n.f38018b);
        return accessibilityNodeInfoCompatM16259n;
    }

    public static String getActions(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            StringBuilder sb = new StringBuilder();
            for (AccessibilityNodeInfoCompat.a aVar : accessibilityNodeInfoCompatCreateNodeInfoFromView.m16262c()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                int iM16275a = aVar.m16275a();
                if (iM16275a == 1) {
                    sb.append("focus");
                } else if (iM16275a != 2) {
                    switch (iM16275a) {
                        case 4:
                            sb.append("select");
                            break;
                        case 8:
                            sb.append("clear-selection");
                            break;
                        case 16:
                            sb.append("click");
                            break;
                        case 32:
                            sb.append("long-click");
                            break;
                        case 64:
                            sb.append("accessibility-focus");
                            break;
                        case 128:
                            sb.append("clear-accessibility-focus");
                            break;
                        case 256:
                            sb.append("next-at-movement-granularity");
                            break;
                        case 512:
                            sb.append("previous-at-movement-granularity");
                            break;
                        case 1024:
                            sb.append("next-html-element");
                            break;
                        case 2048:
                            sb.append("previous-html-element");
                            break;
                        case 4096:
                            sb.append("scroll-forward");
                            break;
                        case 8192:
                            sb.append("scroll-backward");
                            break;
                        case 16384:
                            sb.append("copy");
                            break;
                        case 32768:
                            sb.append("paste");
                            break;
                        case 65536:
                            sb.append("cut");
                            break;
                        case 131072:
                            sb.append("set-selection");
                            break;
                        default:
                            CharSequence charSequenceM16276b = aVar.m16276b();
                            if (charSequenceM16276b != null) {
                                sb.append(charSequenceM16276b);
                            } else {
                                sb.append("unknown");
                            }
                            break;
                    }
                } else {
                    sb.append("clear-focus");
                }
            }
            return sb.length() > 0 ? sb.toString() : null;
        } finally {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
        }
    }

    public static CharSequence getDescription(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            CharSequence charSequenceM16264g = accessibilityNodeInfoCompatCreateNodeInfoFromView.m16264g();
            CharSequence charSequenceM16266i = accessibilityNodeInfoCompatCreateNodeInfoFromView.m16266i();
            boolean z = !TextUtils.isEmpty(charSequenceM16266i);
            boolean z2 = view instanceof EditText;
            if (!TextUtils.isEmpty(charSequenceM16264g) && (!z2 || !z)) {
                return charSequenceM16264g;
            }
            if (z) {
                return charSequenceM16266i;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatM16259n = AccessibilityNodeInfoCompat.m16259n();
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompatM16259n.f38018b);
                CharSequence description = (!AccessibilityUtil.isSpeakingNode(accessibilityNodeInfoCompatM16259n, childAt) || AccessibilityUtil.isAccessibilityFocusable(accessibilityNodeInfoCompatM16259n, childAt)) ? null : getDescription(childAt);
                if (!TextUtils.isEmpty(description)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(description);
                }
                accessibilityNodeInfoCompatM16259n.f38018b.recycle();
            }
            return sb.length() > 0 ? sb.toString() : null;
        } finally {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
        }
    }

    public static String getFocusableReasons(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            boolean zHasText = AccessibilityUtil.hasText(accessibilityNodeInfoCompatCreateNodeInfoFromView);
            boolean zM16267j = accessibilityNodeInfoCompatCreateNodeInfoFromView.m16267j();
            boolean zHasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(accessibilityNodeInfoCompatCreateNodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(accessibilityNodeInfoCompatCreateNodeInfoFromView)) {
                if (accessibilityNodeInfoCompatCreateNodeInfoFromView.m16263e() <= 0) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                    return "View is actionable and has no children.";
                }
                if (zHasText) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                    return "View is actionable and has a description.";
                }
                if (zM16267j) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                    return "View is actionable and checkable.";
                }
                if (zHasNonActionableSpeakingDescendants) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                    return "View is actionable and has non-actionable descendants with descriptions.";
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(accessibilityNodeInfoCompatCreateNodeInfoFromView, view)) {
                if (zHasText) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                    return "View is a direct child of a scrollable container and has a description.";
                }
                if (zM16267j) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                    return "View is a direct child of a scrollable container and is checkable.";
                }
                if (zHasNonActionableSpeakingDescendants) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                    return "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                }
            }
            if (zHasText) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                return "View has a description and is not actionable, but has no actionable ancestor.";
            }
            accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
            return null;
        } catch (Throwable th) {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
            throw th;
        }
    }

    public static boolean getIgnored(View view) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility == 2 || importantForAccessibility == 4) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (((View) parent).getImportantForAccessibility() == 4) {
                return true;
            }
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!accessibilityNodeInfoCompatCreateNodeInfoFromView.m16270m()) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                return true;
            }
            if (!AccessibilityUtil.isAccessibilityFocusable(accessibilityNodeInfoCompatCreateNodeInfoFromView, view)) {
                if (AccessibilityUtil.hasFocusableAncestor(accessibilityNodeInfoCompatCreateNodeInfoFromView, view) || !AccessibilityUtil.hasText(accessibilityNodeInfoCompatCreateNodeInfoFromView)) {
                    accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                    return true;
                }
                accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                return false;
            }
            if (accessibilityNodeInfoCompatCreateNodeInfoFromView.m16263e() <= 0) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                return false;
            }
            if (AccessibilityUtil.isSpeakingNode(accessibilityNodeInfoCompatCreateNodeInfoFromView, view)) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                return false;
            }
            accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
            return true;
        } catch (Throwable th) {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
            throw th;
        }
    }

    public static String getIgnoredReasons(View view) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (importantForAccessibility == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (((View) parent).getImportantForAccessibility() == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!accessibilityNodeInfoCompatCreateNodeInfoFromView.m16270m()) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                return "View is not visible.";
            }
            if (AccessibilityUtil.isAccessibilityFocusable(accessibilityNodeInfoCompatCreateNodeInfoFromView, view)) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                return "View is actionable, but has no description.";
            }
            if (AccessibilityUtil.hasText(accessibilityNodeInfoCompatCreateNodeInfoFromView)) {
                accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
                return "View is not actionable, and an ancestor View has co-opted its description.";
            }
            accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
            return "View is not actionable and has no description.";
        } catch (Throwable th) {
            accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
            throw th;
        }
    }

    public static boolean getIsAccessibilityFocused(View view) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfoFromView = createNodeInfoFromView(view);
        boolean zIsAccessibilityFocused = accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.isAccessibilityFocused();
        accessibilityNodeInfoCompatCreateNodeInfoFromView.f38018b.recycle();
        return zIsAccessibilityFocused;
    }
}
