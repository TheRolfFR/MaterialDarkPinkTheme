import mdlaf.themes.AbstractMaterialTheme;
import mdlaf.utils.MaterialBorders;
import mdlaf.utils.MaterialColors;
import mdlaf.utils.MaterialFontFactory;
import mdlaf.utils.MaterialImageFactory;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.InsetsUIResource;
import java.awt.*;

@SuppressWarnings("WeakerAccess")
public class MaterialDarkTheme extends AbstractMaterialTheme {

    private static final ColorUIResource BACKGROUND_COLOR = MaterialColors.GRAY_900;
    private static final ColorUIResource TRANSPARENT = new ColorUIResource(new Color(0, 0, 0, 0));
    public static final Color HIGHLIGHT_COLOR = MaterialColors.RED_A400;
    public static final Color HIGHLIGHT_HOVER = HIGHLIGHT_COLOR.darker();
    public static final ColorUIResource HIGHLIGHT_HOVER_COLOR = new ColorUIResource(HIGHLIGHT_HOVER);

    public static Border getInputFieldFocusedBorder() {
        return new MatteBorder(0, 0, 3, 0, HIGHLIGHT_HOVER);
    }
    public static Border getInputFieldUnfocusedBorder() {
        return new MatteBorder(0, 0, 3, 0, HIGHLIGHT_COLOR);
    }

    public static Border getButtonFocusedBorder() {
        return BorderFactory.createCompoundBorder( new MatteBorder(3, 3, 3, 3, HIGHLIGHT_HOVER), BorderFactory.createEmptyBorder(5, 9, 5, 9));
    }
    public static Border getButtonUnfocusedBorder() {
        return BorderFactory.createEmptyBorder(8, 12, 8, 12);
    }

    public MaterialDarkTheme() {
    }

    @Override
    public void installUIDefault(UIDefaults table) {
        super.installUIDefault(table);

        //noinspection SpellCheckingInspection
        table.put("ComboBox.unfocusColor", TRANSPARENT);
        table.put("ComboBox.focusColor", TRANSPARENT);
        table.put("Button[border].enable", false);
        table.put("Button[focus].color", TRANSPARENT);
    }

    public void installTheme() {
        this.installColor();
        this.installFonts();
        this.installBorders();
        this.installIcons();
    }

    protected void installFonts() {
        this.fontBold = MaterialFontFactory.getInstance().getFont("BOLD");
        this.fontItalic = MaterialFontFactory.getInstance().getFont("ITALIC");
        this.fontMedium = MaterialFontFactory.getInstance().getFont("MEDIUM");
        this.fontRegular = MaterialFontFactory.getInstance().getFont("REGULAR");
    }

    protected void installIcons() {
        this.selectedCheckBoxIcon = MaterialImageFactory.getInstance().getImage("white/checked_white");
        this.unselectedCheckBoxIcon = MaterialImageFactory.getInstance().getImage("white/unchecked_white");
        this.selectedRadioButtonIcon = MaterialImageFactory.getInstance().getImage("white/radio-checked-white");
        this.unselectedRadioButtonIcon = MaterialImageFactory.getInstance().getImage("white/radio_unchecked-white");
        this.selectedCheckBoxIconTable = MaterialImageFactory.getInstance().getImage("white/checked_white");
        this.unselectedCheckBoxIconTable = MaterialImageFactory.getInstance().getImage("white/unchecked_white");
        this.closedIconTree = MaterialImageFactory.getInstance().getImage("right_arrow");
        this.openIconTree = MaterialImageFactory.getInstance().getImage("down_arrow");
        this.yesCollapsedTaskPane = MaterialImageFactory.getInstance().getImage("yes-collapsed");
        this.noCollapsedTaskPane = MaterialImageFactory.getInstance().getImage("no-collapsed");
        this.warningIconOptionPane = MaterialImageFactory.getInstance().getImage("warning");
        this.errorIconIconOptionPane = MaterialImageFactory.getInstance().getImage("error");
        this.questionIconOptionPane = MaterialImageFactory.getInstance().getImage("question");
        this.informationIconOptionPane = MaterialImageFactory.getInstance().getImage("information");
        this.iconComputerFileChooser = MaterialImageFactory.getInstance().getImage("white/computer");
        this.iconDirectoryFileChooser = MaterialImageFactory.getInstance().getImage("white/folder");
        this.iconFileFileChooser = MaterialImageFactory.getInstance().getImage("white/file");
        this.iconFloppyDriveFileChooser = MaterialImageFactory.getInstance().getImage("white/floppy_drive");
        this.iconHardDriveFileChooser = MaterialImageFactory.getInstance().getImage("white/hard_drive");
        this.iconHomeFileChooser = MaterialImageFactory.getInstance().getImage("white/home");
        this.iconListFileChooser = MaterialImageFactory.getInstance().getImage("white/list");
        this.iconDetailsFileChooser = MaterialImageFactory.getInstance().getImage("white/details");
        this.iconNewFolderFileChooser = MaterialImageFactory.getInstance().getImage("white/new_folder");
        this.iconUpFolderFileChooser = MaterialImageFactory.getInstance().getImage("white/back_arrow");
    }

    @Override
    protected void installBorders() {
        super.installBorders();
        this.buttonBorder = new BorderUIResource(getButtonUnfocusedBorder());
        this.borderMenu = new BorderUIResource(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.borderMenuBar = MaterialBorders.LIGHT_SHADOW_BORDER;
        this.borderPopupMenu = MaterialBorders.LIGHT_LINE_BORDER;
        this.borderSpinner = MaterialBorders.LIGHT_LINE_BORDER;
        this.arrowButtonBorderSpinner = new BorderUIResource(BorderFactory.createEmptyBorder());
        this.borderPanel = new BorderUIResource(BorderFactory.createEmptyBorder());
        this.arrowButtonBorderScrollBar = new BorderUIResource(BorderFactory.createEmptyBorder());
        this.borderSlider = new BorderUIResource(BorderFactory.createEmptyBorder());
        this.cellBorderTableHeader = new BorderUIResource(BorderFactory.createCompoundBorder(MaterialBorders.LIGHT_LINE_BORDER, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        this.borderToolBar = new BorderUIResource(BorderFactory.createEmptyBorder());
        this.borderTextField = new BorderUIResource(getInputFieldUnfocusedBorder());
        this.borderTaskPane = this.borderPanel;
        this.focusCellHighlightBorder = new BorderUIResource(BorderFactory.createEmptyBorder());
        this.borderComboBox = new BorderUIResource(BorderFactory.createEmptyBorder());
        this.borderItemList = new BorderUIResource(BorderFactory.createEmptyBorder());
        this.tabInsetsTabbedPane = new InsetsUIResource(6, 10, 10, 10);
        this.selectedTabInsetsTabbedPane = new InsetsUIResource(6, 10, 10, 10);
        this.borderFrameRootPane = new BorderUIResource(BorderFactory.createEmptyBorder());
        this.borderDialogRootPane = MaterialBorders.LIGHT_SHADOW_BORDER;
        this.borderProgressBar = new BorderUIResource(BorderFactory.createEmptyBorder());
    }

    protected void installColor() {
        this.backgroundPrimary = BACKGROUND_COLOR;
        this.highlightBackgroundPrimary = new ColorUIResource(HIGHLIGHT_COLOR);
        this.textColor = MaterialColors.WHITE;
        this.disableTextColor = MaterialColors.GRAY_500;
        this.buttonBackgroundColor = this.highlightBackgroundPrimary;
        this.buttonBackgroundColorMouseHover = HIGHLIGHT_HOVER_COLOR;
        this.buttonTextColor = MaterialColors.WHITE;
        this.buttonDefaultBackgroundColorMouseHover = MaterialColors.RED_200;
        this.buttonDefaultBackgroundColor = this.buttonBackgroundColor;
        this.buttonDefaultTextColor = MaterialColors.BLACK;
        this.buttonDisabledBackground = MaterialColors.COSMO_DARK_GRAY;
        this.buttonDisabledForeground = MaterialColors.BLACK;
        this.buttonFocusColor = MaterialColors.GREEN_50;
        this.buttonDefaultFocusColor = MaterialColors.BLACK;
        this.buttonBorderColor = this.buttonBackgroundColor;
        this.buttonColorHighlight = MaterialColors.GRAY_400;
        this.selectedInDropDownBackgroundComboBox = MaterialColors.RED_A400;
        this.selectedForegroundComboBox = MaterialColors.WHITE;
        this.menuBackground = BACKGROUND_COLOR;
        this.menuBackgroundMouseHover = MaterialColors.GRAY_800;
        this.menuTextColor = MaterialColors.WHITE;
        this.menuDisableBackground = MaterialColors.TRANSPANENT;
        this.arrowButtonBackgroundSpinner = BACKGROUND_COLOR;
        this.mouseHoverButtonColorSpinner = MaterialColors.GRAY_800;
        this.arrowButtonColorScrollBar = BACKGROUND_COLOR;
        this.trackColorScrollBar = MaterialColors.GRAY_800;
        this.thumbColorScrollBar = MaterialColors.GRAY_500;
        this.thumbDarkShadowColorScrollBar = MaterialColors.GRAY_500;
        this.thumbHighlightColorScrollBar = MaterialColors.GRAY_500;
        this.thumbShadowColorScrollBar = MaterialColors.GRAY_500;
        this.arrowButtonOnClickColorScrollBar = MaterialColors.GRAY_800;
        this.mouseHoverColorScrollBar = MaterialColors.GRAY_300;
        this.trackColorSlider = MaterialColors.GRAY_800;
        this.haloColorSlider = MaterialColors.bleach(MaterialColors.RED_A200, 0.5F);
        this.highlightColorTabbedPane = BACKGROUND_COLOR;
        this.borderHighlightColorTabbedPane = BACKGROUND_COLOR;
        this.focusColorLineTabbedPane = MaterialColors.RED_A400;
        this.disableColorTabTabbedPane = MaterialColors.COSMO_STRONG_GRAY;
        this.backgroundTable = MaterialColors.GRAY_800;
        this.backgroundTableHeader = BACKGROUND_COLOR;
        this.foregroundTable = MaterialColors.WHITE;
        this.foregroundTableHeader = MaterialColors.RED_A400;
        this.selectionBackgroundTable = MaterialColors.RED_A100;
        this.selectionForegroundTable = MaterialColors.BLACK;
        this.gridColorTable = MaterialColors.COSMO_BLACK;
        this.alternateRowBackgroundTable = MaterialColors.GRAY_800;
        this.dockingBackgroundToolBar = MaterialColors.LIGHT_GREEN_A100;
        this.floatingBackgroundToolBar = MaterialColors.GRAY_200;
        this.selectionBackgroundTree = MaterialColors.GRAY_800;
        this.selectionBorderColorTree = MaterialColors.RED_A400;
        this.backgroundTextField = new ColorUIResource(BACKGROUND_COLOR.brighter());
        this.inactiveForegroundTextField = MaterialColors.WHITE;
        this.inactiveBackgroundTextField = this.backgroundTextField;
        this.selectionBackgroundTextField = MaterialColors.RED_A100;
        this.selectionForegroundTextField = MaterialColors.BLACK;
        this.inactiveColorLineTextField = MaterialColors.WHITE;
        this.activeColorLineTextField = MaterialColors.RED_A400;
        this.titleBackgroundGradientStartTaskPane = MaterialColors.GRAY_300;
        this.titleBackgroundGradientEndTaskPane = MaterialColors.GRAY_500;
        this.titleOverTaskPane = MaterialColors.WHITE;
        this.specialTitleOverTaskPane = MaterialColors.WHITE;
        this.backgroundTaskPane = BACKGROUND_COLOR;
        this.borderColorTaskPane = BACKGROUND_COLOR;
        this.contentBackgroundTaskPane = BACKGROUND_COLOR;
        this.selectionBackgroundList = MaterialColors.GRAY_800;
        this.selectionForegroundList = MaterialColors.WHITE;
        this.backgroundProgressBar = this.backgroundTextField;
        this.foregroundProgressBar = MaterialColors.RED_A400;
    }

    @Override
    public int getArchBorderComboBox() {
        return 0;
    }

    @Override
    public BorderUIResource getBorderComboBox() {
        return super.getBorderComboBox();
    }

    @Override
    public int getArcButton() {
        return 0;
    }

    public String getName() {
        return "Dark Material";
    }
}