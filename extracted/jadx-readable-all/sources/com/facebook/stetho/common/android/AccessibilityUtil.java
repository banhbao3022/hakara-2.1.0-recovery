package com.facebook.stetho.common.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityUtil {
    private AccessibilityUtil() {
    }

    public static boolean hasFocusableAncestor(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null) {
            return false;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        Object parentForAccessibility = view.getParentForAccessibility();
        if (!(parentForAccessibility instanceof View)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatM16259n = AccessibilityNodeInfoCompat.m16259n();
        try {
            ((View) parentForAccessibility).onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompatM16259n.f38018b);
            if (isAccessibilityFocusable(accessibilityNodeInfoCompatM16259n, (View) parentForAccessibility) || hasFocusableAncestor(accessibilityNodeInfoCompatM16259n, (View) parentForAccessibility)) {
                return true;
            }
            accessibilityNodeInfoCompatM16259n.f38018b.recycle();
            return false;
        } finally {
            accessibilityNodeInfoCompatM16259n.f38018b.recycle();
        }
    }

    public static boolean hasNonActionableSpeakingDescendants(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompatM16259n = AccessibilityNodeInfoCompat.m16259n();
                    try {
                        AtomicInteger atomicInteger = ViewCompat.f38073a;
                        childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompatM16259n.f38018b);
                        if (!isAccessibilityFocusable(accessibilityNodeInfoCompatM16259n, childAt) && isSpeakingNode(accessibilityNodeInfoCompatM16259n, childAt)) {
                            return true;
                        }
                        accessibilityNodeInfoCompatM16259n.f38018b.recycle();
                    } finally {
                        accessibilityNodeInfoCompatM16259n.f38018b.recycle();
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasText(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        return (TextUtils.isEmpty(accessibilityNodeInfoCompat.m16266i()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.m16264g())) ? false : true;
    }

    public static boolean isAccessibilityFocusable(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.m16270m()) {
            return false;
        }
        if (isActionableForAccessibility(accessibilityNodeInfoCompat)) {
            return true;
        }
        return isTopLevelScrollItem(accessibilityNodeInfoCompat, view) && isSpeakingNode(accessibilityNodeInfoCompat, view);
    }

    public static boolean isActionableForAccessibility(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        if (accessibilityNodeInfoCompat.f38018b.isClickable() || accessibilityNodeInfoCompat.f38018b.isLongClickable() || accessibilityNodeInfoCompat.m16268k()) {
            return true;
        }
        List<AccessibilityNodeInfoCompat.a> listM16262c = accessibilityNodeInfoCompat.m16262c();
        return listM16262c.contains(16) || listM16262c.contains(32) || listM16262c.contains(1);
    }

    public static boolean isSpeakingNode(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.m16270m()) {
            return false;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility == 4) {
            return false;
        }
        if (importantForAccessibility != 2 || accessibilityNodeInfoCompat.m16263e() > 0) {
            return accessibilityNodeInfoCompat.m16267j() || hasText(accessibilityNodeInfoCompat) || hasNonActionableSpeakingDescendants(accessibilityNodeInfoCompat, view);
        }
        return false;
    }

    public static boolean isTopLevelScrollItem(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null) {
            return false;
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        View view2 = (View) view.getParentForAccessibility();
        if (view2 == null) {
            return false;
        }
        if (accessibilityNodeInfoCompat.m16269l()) {
            return true;
        }
        List<AccessibilityNodeInfoCompat.a> listM16262c = accessibilityNodeInfoCompat.m16262c();
        if (listM16262c.contains(4096) || listM16262c.contains(8192)) {
            return true;
        }
        if (view2 instanceof Spinner) {
            return false;
        }
        return (view2 instanceof AdapterView) || (view2 instanceof ScrollView) || (view2 instanceof HorizontalScrollView);
    }
}
