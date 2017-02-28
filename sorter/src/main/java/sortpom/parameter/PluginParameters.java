package sortpom.parameter;

import java.io.File;
import java.util.Optional;

/** Contains all parameters that are sent to the plugin */
public class PluginParameters {
    public final File pomFile;
    public final boolean createBackupFile;
    public final String backupFileExtension;
    private final ViolationFile violationFile;
    public final String encoding;
    public final LineSeparatorUtil lineSeparatorUtil;
    public final String indentCharacters;
    public final boolean expandEmptyElements;
    public final String predefinedSortOrder;
    public final String customSortOrderFile;
    public final DependencySortOrder sortDependencies;
    public final DependencySortOrder sortPlugins;
    public final boolean sortProperties;
    public final boolean keepBlankLines;
    public final boolean indentBlankLines;
    public final VerifyFailType verifyFailType;
    public final boolean ignoreLineSeparators;

    PluginParameters(File pomFile, boolean createBackupFile, String backupFileExtension, ViolationFile violationFile, String encoding,
                     LineSeparatorUtil lineSeparatorUtil, boolean expandEmptyElements, boolean keepBlankLines,
                     String indentCharacters, boolean indentBlankLines, String predefinedSortOrder, String customSortOrderFile,
                     DependencySortOrder sortDependencies, DependencySortOrder sortPlugins, boolean sortProperties,
                     VerifyFailType verifyFailType, boolean ignoreLineSeparators) {
        this.pomFile = pomFile;
        this.createBackupFile = createBackupFile;
        this.backupFileExtension = backupFileExtension;
        this.violationFile = violationFile;
        this.encoding = encoding;
        this.lineSeparatorUtil = lineSeparatorUtil;
        this.indentCharacters = indentCharacters;
        this.expandEmptyElements = expandEmptyElements;
        this.predefinedSortOrder = predefinedSortOrder;
        this.customSortOrderFile = customSortOrderFile;
        this.sortDependencies = sortDependencies;
        this.sortPlugins = sortPlugins;
        this.sortProperties = sortProperties;
        this.keepBlankLines = keepBlankLines;
        this.indentBlankLines = indentBlankLines;
        this.verifyFailType = verifyFailType;
        this.ignoreLineSeparators = ignoreLineSeparators;
    }

    public Optional<ViolationFile> getViolationFile() {
        return Optional.ofNullable(violationFile);
    }
}
