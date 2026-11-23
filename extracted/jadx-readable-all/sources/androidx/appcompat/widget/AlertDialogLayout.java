package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p644b.p653h.LinearLayoutCompat;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: q */
    public static int m190q(View view) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m190q(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    @Override // p636z0.p644b.p653h.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int i10 = gravity & 8388615;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i7 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    } else {
                        i5 = paddingRight - measuredWidth;
                        i6 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    if (m14901n(i11)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i13 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    childAt.layout(i7, i13, measuredWidth + i7, measuredHeight2 + i13);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i13;
                } else {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i7 = i5 - i6;
                if (m14901n(i11)) {
                    paddingTop += intrinsicHeight;
                }
                int i14 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                childAt.layout(i7, i14, measuredWidth + i7, measuredHeight2 + i14);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i14;
            }
        }
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iM190q;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view != null) {
                    view.measure(i, 0);
                    paddingBottom += view.getMeasuredHeight();
                    iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    iCombineMeasuredStates = 0;
                }
                if (view2 != null) {
                    view2.measure(i, 0);
                    iM190q = m190q(view2);
                    measuredHeight = view2.getMeasuredHeight() - iM190q;
                    paddingBottom += iM190q;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                } else {
                    iM190q = 0;
                    measuredHeight = 0;
                }
                if (view3 != null) {
                    view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
                    measuredHeight2 = view3.getMeasuredHeight();
                    paddingBottom += measuredHeight2;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                } else {
                    measuredHeight2 = 0;
                }
                int i4 = size - paddingBottom;
                if (view2 != null) {
                    int i5 = paddingBottom - iM190q;
                    int iMin = Math.min(i4, measuredHeight);
                    if (iMin > 0) {
                        i4 -= iMin;
                        iM190q += iMin;
                    }
                    view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM190q, 1073741824));
                    paddingBottom = i5 + view2.getMeasuredHeight();
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                }
                if (view3 != null && i4 > 0) {
                    view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
                    paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                }
                int iMax = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i2, 0));
                if (mode2 != 1073741824) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt2 = getChildAt(i7);
                        if (childAt2.getVisibility() != 8) {
                            LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt2.getLayoutParams();
                            if (((LinearLayout.LayoutParams) aVar).width == -1) {
                                int i8 = ((LinearLayout.LayoutParams) aVar).height;
                                ((LinearLayout.LayoutParams) aVar).height = childAt2.getMeasuredHeight();
                                measureChildWithMargins(childAt2, iMakeMeasureSpec, 0, i2, 0);
                                ((LinearLayout.LayoutParams) aVar).height = i8;
                            }
                        }
                    }
                }
                z = true;
                break;
            }
            View childAt3 = getChildAt(i3);
            if (childAt3.getVisibility() != 8) {
                int id = childAt3.getId();
                if (id == R.id.topPanel) {
                    view = childAt3;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt3;
                } else if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                    break;
                } else {
                    view3 = childAt3;
                }
            }
            i3++;
        }
        if (z) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
