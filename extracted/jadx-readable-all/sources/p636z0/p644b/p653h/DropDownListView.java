package p636z0.p644b.p653h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import mtp.media.karaoke.R;
import p636z0.p644b.p648e.p649a.DrawableWrapper;
import p636z0.p725k.p742m.ListViewAutoScrollHelper;

/* JADX INFO: renamed from: z0.b.h.f0, reason: use source file name */
/* JADX INFO: compiled from: DropDownListView.java */
/* JADX INFO: loaded from: classes.dex */
public class DropDownListView extends ListView {

    /* JADX INFO: renamed from: f */
    public final Rect f35017f;

    /* JADX INFO: renamed from: g */
    public int f35018g;

    /* JADX INFO: renamed from: h */
    public int f35019h;

    /* JADX INFO: renamed from: i */
    public int f35020i;

    /* JADX INFO: renamed from: j */
    public int f35021j;

    /* JADX INFO: renamed from: k */
    public int f35022k;

    /* JADX INFO: renamed from: l */
    public Field f35023l;

    /* JADX INFO: renamed from: m */
    public a f35024m;

    /* JADX INFO: renamed from: n */
    public boolean f35025n;

    /* JADX INFO: renamed from: o */
    public boolean f35026o;

    /* JADX INFO: renamed from: p */
    public boolean f35027p;

    /* JADX INFO: renamed from: q */
    public ListViewAutoScrollHelper f35028q;

    /* JADX INFO: renamed from: r */
    public b f35029r;

    /* JADX INFO: renamed from: z0.b.h.f0$a */
    /* JADX INFO: compiled from: DropDownListView.java */
    public static class a extends DrawableWrapper {

        /* JADX INFO: renamed from: g */
        public boolean f35030g;

        public a(Drawable drawable) {
            super(drawable);
            this.f35030g = true;
        }

        @Override // p636z0.p644b.p648e.p649a.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f35030g) {
                this.f34658f.draw(canvas);
            }
        }

        @Override // p636z0.p644b.p648e.p649a.DrawableWrapper, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f35030g) {
                this.f34658f.setHotspot(f, f2);
            }
        }

        @Override // p636z0.p644b.p648e.p649a.DrawableWrapper, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f35030g) {
                this.f34658f.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p636z0.p644b.p648e.p649a.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f35030g) {
                return this.f34658f.setState(iArr);
            }
            return false;
        }

        @Override // p636z0.p644b.p648e.p649a.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f35030g) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.f0$b */
    /* JADX INFO: compiled from: DropDownListView.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f35029r = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f35017f = new Rect();
        this.f35018g = 0;
        this.f35019h = 0;
        this.f35020i = 0;
        this.f35021j = 0;
        this.f35026o = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f35023l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f35024m;
        if (aVar != null) {
            aVar.f35030g = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m14889a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < count) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return (i3 < 0 || i4 <= i3 || i6 <= 0 || measuredHeight == i2) ? i2 : i6;
            }
            if (i3 >= 0 && i4 >= i3) {
                i6 = measuredHeight;
            }
            i4++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0127  */
    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0157  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX INFO: renamed from: b */
    public boolean m14890b(MotionEvent motionEvent, int i) {
        boolean z;
        View childAt;
        View childAt2;
        ListViewAutoScrollHelper listViewAutoScrollHelper;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = false;
                if (z || z2) {
                    this.f35027p = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f35022k - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z) {
                    if (this.f35028q == null) {
                        this.f35028q = new ListViewAutoScrollHelper(this);
                    }
                    ListViewAutoScrollHelper listViewAutoScrollHelper2 = this.f35028q;
                    boolean z3 = listViewAutoScrollHelper2.f38114v;
                    listViewAutoScrollHelper2.f38114v = true;
                    listViewAutoScrollHelper2.onTouch(this, motionEvent);
                } else {
                    listViewAutoScrollHelper = this.f35028q;
                    if (listViewAutoScrollHelper != null) {
                        if (listViewAutoScrollHelper.f38114v) {
                            listViewAutoScrollHelper.m16357f();
                        }
                        listViewAutoScrollHelper.f38114v = false;
                    }
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f35027p = true;
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f35022k;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f35022k = iPointToPosition;
                childAt3.drawableHotspotChanged(f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.f35017f;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.f35018g;
                rect.top -= this.f35019h;
                rect.right += this.f35020i;
                rect.bottom += this.f35021j;
                try {
                    boolean z5 = this.f35023l.getBoolean(this);
                    if (childAt3.isEnabled() != z5) {
                        this.f35023l.set(this, Boolean.valueOf(!z5));
                        if (iPointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (z4) {
                    Rect rect2 = this.f35017f;
                    float fExactCenterX = rect2.exactCenterX();
                    float fExactCenterY = rect2.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                setSelectorEnabled(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            this.f35027p = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f35022k - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f35027p = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f35022k - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z) {
            if (this.f35028q == null) {
                this.f35028q = new ListViewAutoScrollHelper(this);
            }
            ListViewAutoScrollHelper listViewAutoScrollHelper3 = this.f35028q;
            boolean z6 = listViewAutoScrollHelper3.f38114v;
            listViewAutoScrollHelper3.f38114v = true;
            listViewAutoScrollHelper3.onTouch(this, motionEvent);
        } else {
            listViewAutoScrollHelper = this.f35028q;
            if (listViewAutoScrollHelper != null) {
                if (listViewAutoScrollHelper.f38114v) {
                    listViewAutoScrollHelper.m16357f();
                }
                listViewAutoScrollHelper.f38114v = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m14891c() {
        Drawable selector = getSelector();
        if (selector != null && this.f35027p && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f35017f.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f35017f);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f35029r != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m14891c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f35026o || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f35026o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f35026o || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f35026o && this.f35025n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f35029r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f35029r == null) {
            b bVar = new b();
            this.f35029r = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                m14891c();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f35022k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f35029r;
        if (bVar != null) {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f35029r = null;
            dropDownListView.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f35025n = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f35024m = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f35018g = rect.left;
        this.f35019h = rect.top;
        this.f35020i = rect.right;
        this.f35021j = rect.bottom;
    }
}
